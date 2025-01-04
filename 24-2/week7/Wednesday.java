import java.io.*;
import java.util.*;

class Wednesday{
  public static void main(String[] args) throws IOException{
    //N 개의 실행되고 있는 앱의 메모리와 그 비용 M[N] C[N]
    //필요한 메모리 m
    //다이나믹 프로그래밍
    
    //dp[][]를 어떻게 구성하는가?
    //N개의 프로그램을 종료했을 때 얻는 최소 비용 C
    //아닌거 같은데

    //1개 프로그램을 실행 취소 시킬 수 있을 때, 프로그램 1만 고려한 최소비용 c[1][1]
    //2개 프로그램을 실행 취소 시킬 수 있을 때, 프로그램 1만 고려한 최소비용 c[2][1]
    //...
    //N개 프로그램을 실행 취소 시킬 수 있을 때, 프로그램 N만 고려한 최소비용 c[N][N]
    //이것도 아닌 거 같다

    //M메모리가 필요할 때 N개의 프로그램중 만들 수 있는 경우의 수 구해서
    //해당 경우의 제거 비용을 과 최소비용을 비교 가장 작은 비용 선택

    //N=5, m=60
    //A[1]=30 A[2]=10 A[3]=20 A[4]=35 A[5]=40
    //검사한 프로그램을 하나씩 뺴어 가면서 조건을 만족한 조합과 그 비용을 저장 하여 최솟값과 비교 만족 안돼면 파기

  //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //   StringTokenizer st;
    
  //   st = new StringTokenizer(br.readLine());
  //   int N = Integer.parseInt(st.nextToken());
  //   int m = Integer.parseInt(st.nextToken());

  //   int[] M = new int[N];
  //   int[] C = new int[N];
  //   st = new StringTokenizer(br.readLine());
  //   for(int i = 0; i < N; i++){
  //     M[i] = Integer.parseInt(st.nextToken());
  //   }
  //   st = new StringTokenizer(br.readLine());
  //   for(int i = 0; i < N; i++){
  //     C[i] = Integer.parseInt(st.nextToken());
  //   }

  //   int min = Integer.MAX_VALUE;
  //   for(int i=0; i<N; i++){
  //     int curM = m - M[i];
  //     int c = C[i];
  //     if(curM < 0)break;
  //     if(curM == 0){
  //         min = Math.min(min,c);
  //         break;
  //       }
  //     for(int j = i+1; j<N;j++){
  //       if(curM - M[j] < 0)  break;
  //       curM -= M[j];
  //       c += C[j];
  //       if(curM == 0){
  //         min = Math.min(min,c);
  //         break;
  //       }
  //     }
  //   }
  //   System.out.println(min);
  // 더 많은 메모리를 가지고 더 적은 비용을 가진 경우 혹은 같은 메모리에 비용이 더 적은 프로그램을 식별하지 못해 죄적의 경우를 찾지 못한다.
  //=>DP를 이용해야 한다.
  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] M = new int[N];
    int[] C = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < N; i++){
      M[i] = Integer.parseInt(st.nextToken());
    }
    
    st = new StringTokenizer(br.readLine());
    int max = 0;
    for(int i = 0; i < N; i++){
      C[i] = Integer.parseInt(st.nextToken());
      max += C[i];
    }

    int[] dp = new int[max+1];

    for(int i = 0; i < N; i++){
      for(int j = max; j >= C[i]; j--){
        dp[j] = Math.max(dp[j],dp[j - C[i]] + M[i]);
      }
    }

    int min = Integer.MAX_VALUE;
    for(int i = 0; i <= max; i++){
      if(dp[i] > m) min = Math.min(min,i);
    }

    System.out.print(min);
  }
}