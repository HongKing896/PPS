import java.io.*;
import java.util.*;

class Wednesday{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    long sum = 0;
    long xor = 0;

    for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
      int op = Integer.parseInt(st.nextToken());
      switch (op) {
        case 1 -> {
          int temp = Integer.parseInt(st.nextToken());
          sum += temp;
          xor ^= temp;
        }
        case 2 -> {
          int temp = Integer.parseInt(st.nextToken());
          sum -= temp;
          xor ^= temp;
        }
        case 3 -> sb.append(sum).append("\n");
        case 4 -> sb.append(xor).append("\n");
        default -> {
        }
      }
    }
    System.out.print(sb.toString());
  }
}
