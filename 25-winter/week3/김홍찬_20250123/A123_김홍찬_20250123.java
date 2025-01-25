
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no3062();
    }

    void no3062() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] dp = new int[a + 1];

        dp[1] = 0;

        for (int i = 2; i <= a; i++) {

            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[a]);
        s.close();
    }
}
