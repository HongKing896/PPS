import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Main baekJoon = new Main();
    baekJoon.no1475();
  }

  void no1475() {
    int[] nums = {0,0,0,0,0,0,0,0,0};
    Scanner s = new Scanner(System.in);
    String input = s.next();
    char[] inputs = input.toCharArray();
    int[] inputNums = new int[inputs.length];
    for( int i = 0; i < inputs.length; i++){
        inputNums[i] = Character.getNumericValue(inputs[i]);
    }

    for(int i = 0; i < inputNums.length; i++){
      if(inputNums[i] == 9) nums[6]++;
      else nums[inputNums[i]]++;
    }
    nums[6] = (int)Math.ceil((double)nums[6]/2.0);
    int result = nums[0];
    for(int i =0; i < nums.length; i++) {
      if(result < nums[i]) result = nums[i];
    }
    System.out.println(result);
  }
}
