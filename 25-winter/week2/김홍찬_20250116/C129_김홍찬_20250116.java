//https://www.acmicpc.net/problem/7576
//didn't solve myself

import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException {
    Main baekjoon = new Main();
    //토마토
    baekjoon.no7576();
  }

  void no7576() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int m = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int[][] map = new int[n][m];
    boolean[][] visited = new boolean[n][m];
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    Queue<int[]> q = new LinkedList<>();

    for(int i=0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<m; j++){
        map[i][j] = Integer.parseInt(st.nextToken());
        if(map[i][j] == 1){
          q.add(new int[]{i, j});
          visited[i][j] = true;
        }
      }
    }

    while(!q.isEmpty()){
      int[] cur = q.poll();
      for(int k=0; k<4; k++){
        int nx = cur[0] + dx[k];
        int ny = cur[1] + dy[k];
        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        if(visited[nx][ny] || map[nx][ny] == -1) continue;
        visited[nx][ny] = true;
        map[nx][ny] = map[cur[0]][cur[1]] + 1;
        q.add(new int[]{nx, ny});
      }
    }

    int max = 0;
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        if(map[i][j] == 0){
          System.out.println(-1);
          return;
        }
        max = Math.max(max, map[i][j]);
      }
    }
    System.out.println(max-1);
  }
}