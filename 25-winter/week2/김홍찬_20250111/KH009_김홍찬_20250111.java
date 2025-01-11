//https://www.acmicpc.net/problem/2504
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main beakjoon = new Main();
        //괄호의 값
        beakjoon.no2504();
    }

    void no2504(){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        Stack<String> stk = new Stack<>();
        int sum = 0;
        int tmp = 1;
        for(int i=0; i<in.length(); i++){
            String ch = in.substring(i, i+1);
            if(ch.equals("(")){
                tmp *= 2;
                stk.push(ch);
            }else if(ch.equals("[")){
                tmp *= 3;
                stk.push(ch);
            }else if(ch.equals(")")){
                //이전 값이 (인 경우에만 tmp를 더해준다.
                if(stk.isEmpty() || !stk.peek().equals("(")){
                    System.out.print(0);
                    return;
                }
                if(in.substring(i-1, i).equals("(")) sum += tmp;
                stk.pop();
                tmp /= 2;
            }else if(ch.equals("]")){
                //이전 값이 [인 경우에만 tmp를 더해준다.
                if(stk.isEmpty() || !stk.peek().equals("[")){
                    System.out.print(0);
                    return;
                }
                if(in.substring(i-1, i).equals("[")) sum += tmp;
                stk.pop();
                tmp /= 3;
            }
        }
        if(stk.isEmpty()) System.out.print(sum);
        else System.out.println(0);
    }
}