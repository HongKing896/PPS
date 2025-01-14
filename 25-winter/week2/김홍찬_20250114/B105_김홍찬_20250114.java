//https://school.programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;

class Main{
    public static void main(String[] args) {
        Main programmers = new Main();
        //최소 직사각형
        int[] answers = {1,2,3,4,5};
        int[] answer = programmers.solution(answers);
        
        System.out.print(Arrays.toString(answer));
    }

    int[] solution(int[] answers) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        int l1 = a1.length, l2 = a2.length, l3 = a3.length;

        for(int i = 0; i<answers.length; i++){
            if(answers[i] == a1[i%l1]) cnt[0]++;
            if(answers[i] == a2[i%l2]) cnt[1]++;
            if(answers[i] == a3[i%l3]) cnt[2]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);
        if(max == cnt[0]) list.add(1);
        if(max == cnt[1]) list.add(2);
        if(max == cnt[2]) list.add(3);
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}