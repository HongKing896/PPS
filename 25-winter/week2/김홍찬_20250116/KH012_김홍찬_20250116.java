//https://www.acmicpc.net/problem/1697
//didn't solve myself

import java.util.*;

class Main{
  public static void main(String[] args) {
    Main baekjoon = new Main();
    //숨바꼭질
    baekjoon.no1697();
  }

  void no1697() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] visited = new int[100001];
    Queue<Integer> q = new LinkedList<>();
    q.add(n);
    visited[n] = 1;

    while(!q.isEmpty()){
      int cur = q.poll();
      if(cur == k){
        System.out.println(visited[cur]-1);
        return;
      }
      if(cur-1 >= 0 && visited[cur-1] == 0){
        q.add(cur-1);
        visited[cur-1] = visited[cur] + 1;
      }
      if(cur+1 <= 100000 && visited[cur+1] == 0){
        q.add(cur+1);
        visited[cur+1] = visited[cur] + 1;
      }
      if(cur*2 <= 100000 && visited[cur*2] == 0){
        q.add(cur*2);
        visited[cur*2] = visited[cur] + 1;
      }
    }
    System.out.println(visited[k]-1);
  }
}