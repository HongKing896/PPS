import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no2953();
  }
  void no2953() {
    Scanner s = new Scanner(System.in);
    int[] player = new int[5];
    int max = 0;
    int num = -1;

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 4; j++){
        player[i] += s.nextInt();
      }
      if( player[i] > max ){
        max = player[i];
        num = i;
      }
    }

    System.out.print((num + 1) + " " + player[num]);
    s.close();
    return;
  }
}