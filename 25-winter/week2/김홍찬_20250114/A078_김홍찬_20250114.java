//https://school.programmers.co.kr/learn/courses/30/lessons/42747

import java.util.*;

class Main{
    public static void main(String[] args) {
        Main programmers = new Main();
        //H-index
        int answer = programmers.solution(new int[]{3, 0, 6, 1, 5});
        System.out.println(answer);
    }

    int solution(int[] citations) {
        int answer = 0;
        Integer[] citationsArray = Arrays.stream(citations).boxed().toArray(i -> new Integer[i]);
        Arrays.sort(citationsArray, (a,b) -> b-a);
        if(citationsArray[0] == 0) return 0;
        int cnt= 0;
        for(int cite : citationsArray){
            cnt++;
            if(cite >= cnt) {
                answer = cnt;
            }
            else break;
        }
        return answer;
    }
}