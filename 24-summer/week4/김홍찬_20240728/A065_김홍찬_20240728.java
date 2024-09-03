
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no11650();
    }

    void no11650() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] xy = new int[N][2];
        for(int i = 0; i < N; i++){
          st = new StringTokenizer(br.readLine());
          xy[i][0] = Integer.parseInt(st.nextToken());
          xy[i][1] = Integer.parseInt(st.nextToken());
        }
        xy = Arrays.stream(xy).sorted((a,b) -> {
          if(a[0] !=  b[0]) return Integer.compare(a[0], b[0]);
          else return Integer.compare(a[1], b[1]);
        }).toArray(int[][]::new);
        for(int[] p : xy){
          System.out.println(p[0] + " " + p[1]);
        }
    }
}
