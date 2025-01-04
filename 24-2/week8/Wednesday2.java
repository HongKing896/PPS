import java.math.BigInteger;
import java.util.*;

class Wednesday2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N == 0){
      System.out.print(1);
      return;
    }
    BigInteger I = BigInteger.ONE;
    for(int i = 1; i <= N; i++){
      I = I.multiply(BigInteger.valueOf(i));
    }
    System.out.print(I.toString());
  }
}