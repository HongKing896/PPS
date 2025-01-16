//https://www.acmicpc.net/problem/2178
//didn't solve myself

import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args) throws IOException {
    Main baekjoon = new Main();
    //미로 탐색
    baekjoon.no2178();
  }

  void no2178() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] map = new int[n][m];
    boolean[][] visited = new boolean[n][m];
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    for(int i=0; i<n; i++){
      String input = br.readLine();
      for(int j=0; j<m; j++){
        map[i][j] = input.charAt(j) - '0';
      }
    }

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{0, 0});
    visited[0][0] = true;

    while(!q.isEmpty()){
      int[] cur = q.poll();
      for(int k=0; k<4; k++){
        int nx = cur[0] + dx[k];
        int ny = cur[1] + dy[k];
        if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        if(visited[nx][ny] || map[nx][ny] == 0) continue;
        visited[nx][ny] = true;
        map[nx][ny] = map[cur[0]][cur[1]] + 1;
        q.add(new int[]{nx, ny});
      }
    }
    System.out.println(map[n-1][m-1]);
  }
}