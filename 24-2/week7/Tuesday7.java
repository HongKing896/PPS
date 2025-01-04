import java.math.BigInteger;
import java.util.*;

class Monday{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    if(N < 2){
      System.out.println(1);
      return;
    }
    BigInteger[] fibo = new BigInteger[N];
    fibo[0] = BigInteger.ONE;
    fibo[1] = BigInteger.ONE;
    for(int i = 2; i < N; i++){
      fibo[i] = fibo[i-1].add(fibo[i-2]);
    }

    System.out.println(fibo[N-1]);
  }
}