import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no2822();
    }

    void no2822() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // int N = Integer.parseInt(br.readLine());
        int[][] nums = new int[8][2];
        int sum = 0;
        for(int j = 0; j < 8; j++){
          int in = Integer.parseInt(br.readLine());
          nums[j][0] = in;
          nums[j][1] = j + 1;
        }
        Arrays.sort(nums,(a,b) -> b[0] - a[0]);
        
        int[] quiz = new int[5];
        for(int i = 0; i < 5; i++){
          sum += nums[i][0];
          quiz[i] = nums[i][1];
        }

        Arrays.sort(quiz);

        sb.append(sum).append("\n");
        for (int i = 0; i < 5; i++) {
            sb.append(quiz[i]);
            if(i != 4 ) sb.append(" ");
        }

        System.out.print(sb);
    }
}
