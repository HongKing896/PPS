import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no11866();
    }

    void no11866() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= N; i++){
          q.add(i);
        }
        sb.append("<");

        while(q.size() > 1){
          for(int i = 0; i < k-1; i++){
            q.add(q.poll());
          }
          sb.append(q.poll()).append(", ");
        }
        sb.append(q.poll()).append(">");
        System.out.print(sb);
    }
}
