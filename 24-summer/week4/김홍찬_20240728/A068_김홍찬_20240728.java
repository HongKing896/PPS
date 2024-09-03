import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no18258();
    }

    void no18258() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] queue = new int[N];
        int size = 0, front = 0, back = 0;
        StringTokenizer st;

        for (int j = 0; j < N; j++) {
            String str = br.readLine();
            if (str.startsWith("push")) {
                st = new StringTokenizer(str);
                st.nextToken();
                queue[back] = Integer.parseInt(st.nextToken());
                back = (back + 1) % N;
                size++;
            } else if (str.equals("pop")) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[front]).append("\n");
                    front = (front + 1) % N;
                    size--;
                }
            } else if (str.equals("size")) {
                sb.append(size).append("\n");
            } else if (str.equals("empty")) {
                if (size == 0) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (str.equals("front")) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[front]).append("\n");
                }
            } else if (str.equals("back")) {
                if (size == 0) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue[(back - 1 + N) % N]).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}
