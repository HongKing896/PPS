import java.io.*;
import java.util.*;

class Firday{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int M = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());
    int[] cases = new int[5];
    for(int i = 0; i < M; i++){
      br.readLine();
      int[] w = new int[N];
      for(int j = 0; j < 4; j++){
        String b = br.readLine();
        int count = 0;
        for(int k = 1; k < 5*N + 1; k += 5){
          if(b.charAt(k) == '*') w[count]++;
          count++;
        }
      }
      for(int j = 0; j < N; j++){
        cases[w[j]]++;
      }
    }
    StringBuilder sb = new StringBuilder();
    for(int j = 0; j < 5; j++){
      sb.append(cases[j]).append(" ");
    }
    System.out.println(sb.toString());
  }
}