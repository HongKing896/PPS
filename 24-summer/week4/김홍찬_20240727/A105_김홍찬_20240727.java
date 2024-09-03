
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1193();
    }

    void no1193() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int line = 1;
        int sum = 0;
        while (true) {
            sum += line;
            if (sum >= a) {
                break;
            }
            line++;
        }
        int position = a - (sum - line + 1) + 1;
        if (line % 2 == 0) {
            System.out.print(position + "/" + (line - position + 1));
        } else {
            System.out.print((line - position + 1) + "/" + position);
        }
        s.close();
    }
}
