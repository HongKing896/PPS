
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no5585();
    }

    void no5585() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int money = 1000 - a;
        int[] charges = {500, 100, 50, 10, 5, 1};
        int sum = 0;

        for (int charge : charges) {
            sum += money / charge;
            money %= charge;
        }

        System.out.println(sum);
        s.close();
    }
}
