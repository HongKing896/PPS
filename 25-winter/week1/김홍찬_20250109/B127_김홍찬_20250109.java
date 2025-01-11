//https://www.acmicpc.net/problem/1874
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //스택 수열
        baekjoon.no1874();
    }
    //현재 수보다 큰 수가 등장하고 나서, 오름차순으로 수열은 만들어 질 수 없다.
    void no1874() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        int index = 1;
        for(int i=0; i<N; i++){
            int in = Integer.parseInt(br.readLine());
            while(index <= in){
                stk.push(index);
                index++;
                sb.append("+").append("\n");
            }
            if(stk.pop() != in) {
                System.out.print("NO");
                return;
            }
            sb.append("-").append("\n");
        }
        System.out.print(sb);
    }
}