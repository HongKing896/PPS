
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no2163();
    }

    void no2163() {
        Scanner s = new Scanner(System.in);
        int times;
        times = s.nextInt();
        s.nextLine();
        double[] sums = new double[times];
        for (int i = 0; i < times; i++) {
            String in = s.nextLine();
            String[] strs = in.split(" ");
            for (String str : strs) {
                switch (str) {
                    case "@" ->
                        sums[i] *= 3;
                    case "%" ->
                        sums[i] += 5;
                    case "#" ->
                        sums[i] -= 7;
                    default ->
                        sums[i] += Double.parseDouble(str);
                }
            }
        }
        s.close();
        for (double sum : sums) {
            System.out.printf("%.2f\n", sum);
        }
    }
}
