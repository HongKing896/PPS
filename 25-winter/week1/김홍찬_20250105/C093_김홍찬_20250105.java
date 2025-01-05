//https://school.programmers.co.kr/learn/courses/30/lessons/42587
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //프린터, 프로세스스
        programmers.no42587();
    }

    void no42587(){
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = 0;

        // 큐에 {우선순위, 인덱스} 형태로 데이터 삽입
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i});
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            boolean isHighest = true;

            // 현재 프로세스보다 높은 우선순위가 있는지 확인
            for (int[] process : queue) {
                if (process[0] > curr[0]) {
                    isHighest = false;
                    break;
                }
            }

            if (isHighest) {
                answer++;
                if (curr[1] == location) {
                    break;
                }
            } else {
                queue.add(curr);
            }
        }

        System.out.println(answer);
    }
}