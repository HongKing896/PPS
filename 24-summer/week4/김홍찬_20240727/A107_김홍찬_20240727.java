
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1292();
    }

    void no1292() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0, sum = 0;
        for (int i = 1; count <= b; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count > b) {
                    break;
                }
                if (count >= a) {
                    sum += i;
                }
            }
        }
        System.out.print(sum);
        s.close();
    }
}
