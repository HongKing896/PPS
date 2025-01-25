
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no10773();
    }

    void no10773() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        s.close();
    }
}
