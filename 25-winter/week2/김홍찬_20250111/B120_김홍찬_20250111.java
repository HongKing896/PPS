//https://www.acmicpc.net/problem/10799
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main beakjoon = new Main();
        //쇠막대기
        beakjoon.no10799();
    }
    
    void no10799() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        Stack<Character> stk = new Stack<>();
        int cnt = 0;
        char prev = in.charAt(0);
        for(char c : in.toCharArray()){
            if(c == '(') {
                stk.push(c);
            }
            else if( c == ')'){
                stk.pop();
                if(prev == '(') cnt += stk.size();
                else cnt++;
            }
            prev = c;
        }
        System.out.print(cnt);
    }
}