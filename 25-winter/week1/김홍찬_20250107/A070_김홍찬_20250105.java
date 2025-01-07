//https://www.acmicpc.net/problem/2164
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main baekjoon = new Main();
        //카드 2
        baekjoon.no2164();
    }

    void no2164(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            queue.remove();
            if(queue.size() == 1) break;
            queue.add(queue.remove());
        }
        System.out.print(queue.peek());
    }
}