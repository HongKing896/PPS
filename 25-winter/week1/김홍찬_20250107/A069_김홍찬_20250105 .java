//https://www.acmicpc.net/submit/11866
import java.util.*;

class Main{
        public static void main(String[] args) {
        Main baekjoon = new Main();
        //요세푸스 문제 0
        baekjoon.no11866();
        }

    void no11866(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder("<");
        
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            for(int i = 0; i < K-1; i++){
                queue.add(queue.remove());
            }
            sb.append(queue.remove()).append(", ");
        }
        sb.append(queue.remove()).append(">");
        System.out.print(sb.toString());
    }
}