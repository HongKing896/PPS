
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no1065();
    }

    void no1065() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int count = 0;
        if (a < 100) {
            count = a;
        } else {
            count = 99;
            for (int i = 100; i <= a; i++) {
                if (isHansu(i)) {
                    count++;
                }
            }
        }
        System.out.println(count);
        s.close();
    }

    boolean isHansu(int number) {
        String numStr = Integer.toString(number);
        int length = numStr.length();

        if (length == 1 || length == 2) {
            return true;
        }

        int diff = (numStr.charAt(1) - numStr.charAt(0));

        for (int i = 2; i < length; i++) {
            if (numStr.charAt(i) - numStr.charAt(i - 1) != diff) {
                return false;
            }
        }

        return true;
    }
}
