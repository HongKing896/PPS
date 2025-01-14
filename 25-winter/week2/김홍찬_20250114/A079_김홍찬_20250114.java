//https://school.programmers.co.kr/learn/courses/30/lessons/42748
import java.util.*;
class Main{
    public static void main(String[] args) {
        Main programmers = new Main();
        //k번째수
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] answer = programmers.solution(array,commands);
        
        System.out.print(Arrays.toString(answer));
    }

    int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int[] temp = new int[commands[i][1]-commands[i][0]+1];
            int idex = 0;
            for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                temp[idex++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}