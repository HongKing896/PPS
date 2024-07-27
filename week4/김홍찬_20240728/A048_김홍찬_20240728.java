import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no();
    }

    void no() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int j = 0; j < N; j++){
            String str = br.readLine();
            if(isGroupWord(str)) count++;
        }
        System.out.println(count);
    }
    boolean isGroupWord(String str){
        int[] cc = new int[26];
        for(int i = 0; i< str.length(); i++){
            cc[str.charAt(i)- 'a']++;
            if(cc[str.charAt(i)- 'a'] > 1){
                if(str.charAt(i) != str.charAt(i-1)) return false;
            }
        }
        return true;
    }
}
