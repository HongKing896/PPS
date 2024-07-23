import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no2577();
  }
  void no2577() {
    int num1,num2,num;
    Scanner s = new Scanner(System.in);
    num = s.nextInt();
    num1 = s.nextInt();
    num2 = s.nextInt();

    String str = Integer.toString(num*num1*num2);
    char[] nums = str.toCharArray();

    int[] counts = new int[9];
    for ( char n : nums ) {
        switch ( n ) {
          case '0':
            counts[0]++;
            break;
          case '1':
            counts[1]++;
            break;
          case '2':
            counts[2]++;
            break;
          case '3':
            counts[3]++;
            break;
          case '4':
            counts[4]++;
            break;
          case '5':
            counts[5]++;
            break;
          case '6':
            counts[6]++;
            break;
          case '7':
            counts[6]++;
            break;
          case '8':
            counts[8]++;
            break;
          case '9':
            counts[9]++;
            break;
          default:
            break;
        }
      }
      for ( int count : counts ) {
        System.out.println(count);
      }
      return;
  }
}