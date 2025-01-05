//https://school.programmers.co.kr/learn/courses/30/lessons/42586
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //기능개발
        programmers.no42586();
    }

    void no42586(){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {};

        List<Integer> dayList = new LinkedList<>();
        for(int i = 0 ; i < speeds.length; i++){
            int remains = 100 - progresses[i];
            // 더블로 계산하고 이후에 올림을 해야 소수점이 미리 버려지지 않음
            int days = (int)Math.ceil((double)remains/speeds[i]);
            dayList.add(days);
        }

        //다음 작업이 현재 작업보다 오래 걸리면 준비된 모든 기능 서비스
        //다음 작업이 현재 작업보다 빨리 끝나면 기능 준비
        List<Integer> cntList = new LinkedList<>();
        int cnt = 1, curr = dayList.remove(0);
        for(int next : dayList){
            if(next <= curr){
                cnt++;
            } else {
                cntList.add(cnt);
                cnt = 1;
                curr = next;
            }
        }
        cntList.add(cnt);
        answer = cntList.stream().mapToInt(i->i).toArray();

        System.out.println(Arrays.toString(answer));
    }
}