//https://school.programmers.co.kr/learn/courses/30/lessons/12906
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //같은 숫자는 싫어
        programmers.no12906();
    }

    void no12906(){
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {};

        //맨 마지막 값을 조회하고 처음 값부터 순차적으로 접근할 수 있는 deque 사용
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(arr[0]);
        for(int node : arr){
            if(deque.getLast() != node){
                deque.add(node);
            }
        }
        answer = new int[deque.size()];
        int i = 0;
        //근데 웃긴게 Stack을 썻어도 for-each반복문을 사용하면 넣은 순서대로 접근이 가능했음.
        //stack이 내부적으로 vector를 사용하여 구현되어서 for-each에서 순서대로 접근이 가능한 것.
        for(int node : deque){
            answer[i++] = node;
        }

        System.out.println(Arrays.toString(answer));
    }
}