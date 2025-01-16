//https://www.acmicpc.net/problem/1926
//didn't solve myself

import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException {
    Main baekjoon = new Main();
    //그림
    baekjoon.no1926();
  }

  void no1926() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] map = new int[n][m];
    boolean[][] visited = new boolean[n][m];
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int max = 0;
    int cnt = 0;

    for(int i=0; i<n; i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<m; j++){
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        if(map[i][j] == 1 && !visited[i][j]){
          cnt++;
          Queue<int[]> q = new LinkedList<>();
          q.add(new int[]{i, j});
          visited[i][j] = true;
          int area = 0;

          while(!q.isEmpty()){
            int[] cur = q.poll();
            area++;
            for(int k=0; k<4; k++){
              int nx = cur[0] + dx[k];
              int ny = cur[1] + dy[k];
              if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
              if(visited[nx][ny] || map[nx][ny] == 0) continue;
              visited[nx][ny] = true;
              q.add(new int[]{nx, ny});
            }
          }
          max = Math.max(max, area);
        }
      }
    }
    System.out.println(cnt);
    System.out.println(max);
  }
}