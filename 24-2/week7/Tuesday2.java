import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Tuesday2{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    
    
    int N = Integer.parseInt(st.nextToken());
    int[] basket = new int[N+1]; 
    for(int i = 1; i < N+1; i++) basket[i] = i;
    
    int M = Integer.parseInt(st.nextToken());
    for(int i = 0; i < M; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      switchNumber(a,b,basket);
    }

    for(int i = 1; i < N+1; i++){
      sb.append(basket[i]).append(" ");
    }

    System.out.println(sb);
  }

  static void switchNumber(int a, int b, int[] l){
    int temp = l[a];
    l[a] = l[b];
    l[b] = temp;
  }
}