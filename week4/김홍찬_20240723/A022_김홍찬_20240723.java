import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no1267();
  }
  void no1267() {
    Scanner s = new Scanner(System.in);
    int Y = 0, M = 0;
    int num = s.nextInt();
    for( int i =0; i < num; i++) {
      int count = s.nextInt();
      if ( (count+1)%30 != 0 ) Y += ((count+1)/30)*10 + 10;
      else Y += ((count+1)/30)*10;
      if( (count+1)%60 != 0 ) M += ((count+1)/60)*15 + 15;
      else M += ((count+1)/60)*15;
    }
    if( Y > M ) System.out.println("M " + M);
    else if( Y < M ) System.out.println("Y " + Y);
    else System.out.println("Y M " + Y);
  }
}