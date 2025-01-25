import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no3052();
  }
  void no3052() {
    Scanner s = new Scanner(System.in);
    Set<Integer> remain = new HashSet<>();
    int input;
    for(int i = 0; i < 10; i++) {
      input = s.nextInt();
      remain.add(input%42);
    }
    System.out.print(remain.size());
    s.close();
    return;
  }
}