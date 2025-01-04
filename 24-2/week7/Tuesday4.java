import java.io.*;
import java.util.*;

class Wednesday{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Set<Integer> treeSet = new TreeSet<>();
    for(int i = 0; i<N; i++){
      treeSet.add(Integer.valueOf(st.nextToken()));
    }

    StringBuilder sb = new StringBuilder();
    for(Integer n: treeSet){
      sb.append(n).append(" ");
    }

    System.out.println(sb);
  }
}