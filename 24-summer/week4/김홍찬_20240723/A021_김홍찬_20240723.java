
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no2010();
    }

    void no2010() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            int count = s.nextInt();
            if (i == num - 1) {
                sum += count; 
            }else {
                sum += (count - 1);
            }
        }
        System.out.println(sum);
    }
}
