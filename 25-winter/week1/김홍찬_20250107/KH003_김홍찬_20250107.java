//https://www.acmicpc.net/problem/2161
import java.util.*;

class Main {
    public static void main(String[] args) {
        Main baekjoon = new Main();
        //카드 1
        baekjoon.no2161();
    }

    void no2161(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 1;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            sb.append(queue.remove()).append(" ");
            if(queue.isEmpty()) break;
            queue.add(queue.remove());
        }
        System.out.print(sb.toString());
    }
}