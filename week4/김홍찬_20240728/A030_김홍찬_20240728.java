
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no17211();
    }

    void no17211() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = s.nextInt();

        double p00 = s.nextDouble();
        double p01 = s.nextDouble();
        double p10 = s.nextDouble();
        double p11 = s.nextDouble();

        double good;
        double bad;
        if (f == 0) {
            good = 1000;
            bad = 1000 - good;
        } else {
            good = 0;
            bad = 1000 - good;
        }
        for (int i = 0; i < n; i++) {
            double newGood = good * p00 + bad * p10;
            double newBad = good * p01 + bad * p11;

            good = newGood;
            bad = newBad;
        }

        System.out.println(Math.round(good));
        System.out.println(Math.round(bad));
    }
}
