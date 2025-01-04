import java.util.*;

class Friday{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[][] dp = new int[K+1][N+1];

    for(int i = 0; i <= K; i++){
      dp[i][0] = 1;
    }

    for(int i = 0; i <= N; i++){
      dp[1][i] = 1;
    }

    for(int k = 2; k <=K; k++){
      for(int n = 1; n <=N; n++){
        dp[k][n] = dp[k-1][n] + dp[k][n-1];
      }
    }
    System.out.print(dp[K][N]);
  }
}