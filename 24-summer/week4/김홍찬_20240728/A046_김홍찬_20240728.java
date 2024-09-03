
import java.util.Arrays;
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1159();
    }

    void no1159() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        int[] cc = new int[26];
        for(int i = 0; i < t; i++){
            String str = s.nextLine();
            cc[str.charAt(0)-'a']++;
        }
        int max = Arrays.stream(cc).max().isPresent()
            ? Arrays.stream(cc).max().getAsInt()
            : 0;
        if(max >= 5){
            for(int i = 0; i < 26; i++ ){
                if(cc[i] >= 5){
                    System.out.print((char)(i+'a'));
                }
            }
        }else System.out.println("PREDAJA");
    }
}
