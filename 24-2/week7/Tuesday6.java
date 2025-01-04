import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Thursday{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String strM = br.readLine();
    int M = Integer.parseInt(strM);
    int[] Ms = Arrays.stream(strM.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
    
    for(int i = Ms.length-1; i >= 0; i--){
      System.out.println(N*Ms[i]);
    }
    System.out.println(N*M);
  }
}