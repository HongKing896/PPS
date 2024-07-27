
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no2577();
    }

    void no2577() {
        int num1, num2, num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        num1 = s.nextInt();
        num2 = s.nextInt();

        String str = Integer.toString(num * num1 * num2);
        char[] nums = str.toCharArray();

        int[] counts = new int[10];
        for (char n : nums) {
            switch (n) {
                case '0' ->
                    counts[0]++;
                case '1' ->
                    counts[1]++;
                case '2' ->
                    counts[2]++;
                case '3' ->
                    counts[3]++;
                case '4' ->
                    counts[4]++;
                case '5' ->
                    counts[5]++;
                case '6' ->
                    counts[6]++;
                case '7' ->
                    counts[7]++;
                case '8' ->
                    counts[8]++;
                case '9' ->
                    counts[9]++;
                default -> {
                }
            }
        }
        for (int count : counts) {
            System.out.println(count);
        }
    }
}
