import java.io.*;
import java.util.*;

class Friday{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] cer = new String[N];
    for(int i = 0; i < N; i++){
      cer[i] = br.readLine();
    }
    Arrays.sort(cer, (String a, String b) -> {
        if(a.length() != b.length()) return a.length() - b.length();

        int sumA = getSum(a);
        int sumB = getSum(b);
        if(sumA != sumB) return sumA - sumB;

        return a.compareTo(b);
    });
    StringBuilder sb = new StringBuilder();
    for(String s:cer){
      sb.append(s).append("\n");
    }
    System.out.println(sb);
  }

  public static int getSum(String s){
    int sum = 0;
    for(char ch : s.toCharArray()){
      if(Character.isDigit(ch)){
        sum += ch - '0';
      }
    }
    return sum;
  }
}