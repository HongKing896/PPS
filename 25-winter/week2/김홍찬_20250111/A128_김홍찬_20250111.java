//https://www.acmicpc.net/problem/4949
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main beakjoon = new Main();
        //균형잡힌 세상
        beakjoon.no4949();
    }
    
    void no4949() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true){
          Boolean isJudged = false;
          String in = br.readLine();
          if(in.equals(".")) break;
          Stack<Character> stk = new Stack<>();
          for(char ch : in.toCharArray()){
              if(ch == '[' || ch == '(') stk.push(ch);
              else if(ch == ']'){ 
                if(!stk.isEmpty() && stk.peek() == '[')
                  stk.pop();
                else {
                  isJudged = true;
                  break;
                }
              } else if(ch == ')'){
                if( !stk.isEmpty() && stk.peek() == '(')
                stk.pop();
                else {
                  isJudged = true;
                  break;
                }
              }
          }
          if(!isJudged && stk.isEmpty()) sb.append("yes").append("\n");
          else sb.append("no").append("\n");
        }
        System.out.print(sb);
    }
}