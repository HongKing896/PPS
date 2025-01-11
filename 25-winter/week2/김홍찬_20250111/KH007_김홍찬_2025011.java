//https://www.acmicpc.net/problem/2493
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //탑
        baekjoon.no2493();
    }
    void no2493() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<int[]> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            int height = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()){
                if(stack.peek()[1] > height){
                    sb.append(stack.peek()[0]).append(" ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()){
                sb.append("0 ");
            }
            stack.push(new int[]{i, height});
        }
        System.out.println(sb);
    }
}