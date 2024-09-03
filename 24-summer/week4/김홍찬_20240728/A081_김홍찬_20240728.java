import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no2693();
    }

    void no2693() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
          st = new StringTokenizer(br.readLine());
          int[] in = new int[10];
          for(int j = 0; j < 10; j ++){
            in[j] = Integer.parseInt(st.nextToken());
          }
          Arrays.sort(in);
          sb.append(in[7]).append("\n");
        }
        System.out.print(sb);
    }
}
