
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1934();
    }

    void no1934() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int a = s.nextInt();
            int b = s.nextInt();

            int lcm = (a * b) / gcd(a, b);
            System.out.println(lcm);
        }
        s.close();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
