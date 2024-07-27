
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no14487();
    }

    void no14487() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int max = 0, sum = 0;
        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            if (b > max) {
                max = b;
            }
            sum += b;
        }
        sum -= max;
        System.out.print(sum);
        s.close();
    }
}
