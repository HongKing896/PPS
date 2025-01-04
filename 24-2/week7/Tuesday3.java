import java.io.*;
import java.util.*;

class Wednesday2{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] strs = new String[str.length()];
    for(int i = 0; i < str.length(); i++){
      strs[i] = str.substring(i+1);
    }
    strs[str.length()-1] = str;
    Arrays.sort(strs);
    StringBuilder sb = new StringBuilder();
    for(String s:strs){
      sb.append(s).append("\n");
    }
    System.out.print(sb);
  }
}