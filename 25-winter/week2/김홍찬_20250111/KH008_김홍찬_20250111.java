//https://www.acmicpc.net/problem/3986
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main beakjoon = new Main();
        //좋은 단어
        beakjoon.no3986();
    }
    void no3986() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<N; i++){
            Stack<Character> stk = new Stack<>();
            String in = br.readLine();
            for(char ch : in.toCharArray()){
                if(stk.isEmpty()) stk.push(ch);
                else if(stk.peek() == ch) stk.pop();
                else stk.push(ch);
            }
            if(stk.isEmpty()) cnt++;
        }
        System.out.println(cnt);
    }
}
