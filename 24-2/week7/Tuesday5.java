import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Thursday2{
  //메모리 초과
  // public static void main(String[] args) throws IOException {
  //   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  //   int N = Integer.parseInt(br.readLine());
  //   int[] nums = new int[N];
  //   StringTokenizer st = new StringTokenizer(br.readLine());
  //   for(int i=0; i<N; i++) nums[i] = Integer.parseInt(st.nextToken());
    
  //   StringBuilder sb = new StringBuilder();
  //   for(int i=0; i<N; i++) {
  //     sb.append(NGE(i, nums)).append(" ");
  //   }
  //   System.out.println(sb);
  // }

  // static int NGE(int a,int[] nums){
  //   int i = a+1;
  //   int max = -1;
  //   while(i < nums.length){
  //     if(nums[i] > nums[a] && nums[i] > max) {
  //       max = nums[i];
  //       break;
  //     }
  //     i++;
  //   }
  //   return max;
  // }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] nums = new int[N];
    int[] res = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<N; i++) nums[i] = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();

    Stack<Integer> stk = new Stack<>();

    for(int i = N-1; i>=0; i--){
      while(!stk.empty()&&stk.peek() <= nums[i]){
        stk.pop();
      }

      if(stk.empty()) res[i] = -1;
      else res[i] = stk.peek();
      
      stk.push(nums[i]);
    }

    for(int num : res){
      sb.append(num).append(" ");
    }
    System.out.println(sb);

  }
}