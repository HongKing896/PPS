//https://www.acmicpc.net/problem/26042
import java.io.*;
import java.util.*;

class Main{
        public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //식당 입구 대기 줄
        baekjoon.no26042();
        }

    void no26042() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        int max = 0, num = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            if(in == 1){
                int n = Integer.parseInt(st.nextToken());
                queue.add(n);
                if(max < queue.size()) {
                    max = queue.size();
                    num = n;
                } else if(max == queue.size()) {
                    num = Math.min(num, queue.getLast());
                }
            }else queue.remove();
        }
        System.out.println(max + " " + num);
    }
}