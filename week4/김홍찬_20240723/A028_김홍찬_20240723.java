import java.util.Scanner;
import java.math.BigInteger;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no10757();
  }
  void no10757() {
    Scanner s = new Scanner(System.in);
    BigInteger n1,n2;
    n1 = s.nextBigInteger();
    n2 = s.nextBigInteger();
    System.out.print(n1.add(n2));
  }
}