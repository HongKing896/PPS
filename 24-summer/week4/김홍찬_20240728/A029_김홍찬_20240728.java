
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no17210();
    }

    void no17210() {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int f = s.nextInt();
        if (n >= 6) {
            System.out.println("Love is open door");
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(1 - f);
            f = 1 - f;
        }
    }
}
