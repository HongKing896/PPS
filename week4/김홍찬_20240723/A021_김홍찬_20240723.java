import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no2455();
  }
  void no2455() {
    Scanner s = new Scanner(System.in);
    int max = 0,in,out,curr=0;

    for( int i =0; i < 4; i++){
      out = s.nextInt();
      in = s.nextInt();
      curr += (in - out);
      if( curr > max ) max = curr;
    }
    s.close();
    System.out.println(max);
  }
}