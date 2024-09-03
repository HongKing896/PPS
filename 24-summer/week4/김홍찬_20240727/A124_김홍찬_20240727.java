
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no11653();
    }

    void no11653() {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();

        while (a % 2 == 0) {
            System.out.println(2);
            a /= 2;
        }

        for (long i = 3; i * i <= a; i += 2) {
            while (a % i == 0) {
                System.out.println(i);
                a /= i;
            }
        }

        if (a > 2) {
            System.out.println(a);
        }

        s.close();
    }
}
