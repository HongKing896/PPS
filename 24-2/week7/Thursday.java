import java.math.BigInteger;
import java.util.*;

class Thursday{
  public static void main(String[] args) {
    Scanner s =new Scanner(System.in);

    int N = s.nextInt();
    int M = s.nextInt();

    // N 개 중에 M번 고르는 중복 조합
    // H(n,r) = C(n+r-1,r)
    // 각 종류를 하나씩은 훔쳐야함 => r = M-N
    // H(N,M-N) = C(N+M-N-1,M-N) = C(M-1,N-1)
    int n = M-1;
    int r = N-1;
    BigInteger nF = BigInteger.ONE;
    BigInteger rF = BigInteger.ONE;
    BigInteger nrF = BigInteger.ONE;
    for(int i = 1; i <= n; i++) nF = nF.multiply(BigInteger.valueOf(i));
    for(int i = 1; i <= r; i++) rF = rF.multiply(BigInteger.valueOf(i));
    for(int i = 1; i <= (n-r); i++) nrF = nrF.multiply(BigInteger.valueOf(i));
    BigInteger res = nF.divide(rF.multiply(nrF));
    System.out.println(res);
  }
}