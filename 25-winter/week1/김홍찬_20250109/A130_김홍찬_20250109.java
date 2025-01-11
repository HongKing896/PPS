//https://www.acmicpc.net/problem/10773
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //제로
        baekjoon.no10773();
    }
    void no10773() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<N; i++){
            int in = Integer.parseInt(br.readLine());
            if(in == 0) stk.pop();
            else stk.push(in);
        }
        int sum = 0;
        for(int n : stk){
            sum += n;
        }
        System.out.println(sum);
    }
}