//https://school.programmers.co.kr/learn/courses/30/lessons/86491
import java.util.*;

class Main{
    public static void main(String[] args) {
        Main programmers = new Main();
        //최소 직사각형형
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int answer = programmers.solution(sizes); 
        
        System.out.print(answer);
    }
    int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0, maxH = 0;
        for(int[] size : sizes){
            Arrays.sort(size);
            if(size[0] >= maxW) maxW = size[0];
            if(size[1] >= maxH) maxH = size[1];
        }
        answer = maxW * maxH;
        return answer;
    }
}