import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no2163();
  }
  void no2163() {
    Scanner s = new Scanner(System.in);
    int times;
    int low = s.nextInt();
    int column = s.nextInt();
    times = low*(column - 1) + (low-1);
    System.out.print(times);
    s.close();
    return;
  }
}