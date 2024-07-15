import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no1026();
  }

  void no1026() {
    Scanner s = new Scanner(System.in);
    int length = s.nextInt();
    s.nextLine();
    String input = s.nextLine();
    String[] inputs = input.split(" ");
    int[] inputA = new int[length];
    for (int i = 0; i < length; i++) {
      inputA[i] = Integer.parseInt(inputs[i]);
    }
    input = s.nextLine();
    inputs = input.split(" ");
    int[] inputB = new int[length];
    for (int i = 0; i < length; i++) {
      inputB[i] = Integer.parseInt(inputs[i]);
    }
    FunctionS S = new FunctionS(inputA, inputB);
    int result = S.simulateMin();
    System.out.print(result);
  }
}

class FunctionS {
  private int[] A;
  private int[] B;

  public FunctionS() {
  }

  public FunctionS(int[] A, int[] B) {
    this.A = A;
    this.B = B;
  }

  public int simulateMin() {
    int[] ascendingA = Arrays.copyOf(this.A, this.A.length);
    Arrays.sort(ascendingA);
    int[] descendingB = Arrays.copyOf(this.B, this.B.length);
    Arrays.sort(descendingB);
    reverseArray(descendingB);

    for (int i = 0; i < this.A.length; i++) {
      for (int j = 0; j < this.B.length; j++) {
        if (this.B[i] == descendingB[j]) {
          this.A[i] = ascendingA[j];
          descendingB[j] = -1;
          break;
        }
      }
    }

    int result = 0;
    for (int i = 0; i < this.A.length; i++) {
      result += this.A[i] * this.B[i];
    }
    return result;
  }

  public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}