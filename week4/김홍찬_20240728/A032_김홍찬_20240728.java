
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Main baekJoon = new Main();
        baekJoon.no2775();
    }

    void no2775() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int k = s.nextInt();
            int n = s.nextInt();

            int[][] apt = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                apt[0][j] = j;
            }

            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    apt[j][l] = apt[j][l - 1] + apt[j - 1][l];
                }
            }

            System.out.println(apt[k][n]);
        }
    }
}
