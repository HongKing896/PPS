//https://school.programmers.co.kr/learn/courses/30/lessons/12909
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //올바른 괄호
        programmers.no12909();
    }

    void no12909(){
        String s = "()()";
        boolean answer = true;

        //스택 안쓰고 그냥 카운트 하나 두고 올렸다 내렸다 하면서 풀 수도 있음!
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push(ch);
            else {
                if(stack.isEmpty()) answer = false;
                else stack.pop();
            }
        }
        if(!stack.isEmpty()) answer = false;
        
        System.out.println(answer);
    }
}