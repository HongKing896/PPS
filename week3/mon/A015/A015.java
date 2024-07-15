import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no2475();
  }

  void no2475() {
    Scanner s = new Scanner(System.in);

    String input = s.nextLine();
    String[] inputs = input.split(" ");
    int[] nums = new int[inputs.length]; 
    for( int i = 0; i < inputs.length; i++){
        nums[i] = Integer.parseInt(inputs[i]);
    }

    int out = 0;
    for(int i = 0; i < nums.length; i++){
      out += Math.pow(nums[i],2);
    }
    out = out % 10;

    System.out.println(out);
  }
}
