import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Thursday{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Thursday t = new Thursday();
    int T = Integer.parseInt(br.readLine());
    int count = 0;
    st= new StringTokenizer(br.readLine());
    for(int i = 0; i<T; i++){
      int num = Integer.parseInt(st.nextToken());
      if(t.isPrime(num)) count++;
    }
    System.out.println(count);
  }

  public boolean isPrime(int n){
    if(n == 1) return false;
    if(n == 2) return true;
    if(n%2 == 0) return false;
    for(int i = 3; i <= Math.sqrt(n); i+=2){
      if(n%i == 0) return false;
    }
    return true;
  }
}