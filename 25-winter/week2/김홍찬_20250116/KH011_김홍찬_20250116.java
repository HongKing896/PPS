//https://www.acmicpc.net/problem/4179
//didn't solve myself

import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException {
    Main baekjoon = new Main();
    //불!
    baekjoon.no4179();
  }

  void no4179() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int r = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    char[][] map = new char[r][c];
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    Queue<int[]> q = new LinkedList<>();
    Queue<int[]> fire = new LinkedList<>();
    boolean[][] visited = new boolean[r][c];

    for(int i=0; i<r; i++){
      String input = br.readLine();
      for(int j=0; j<c; j++){
        map[i][j] = input.charAt(j);
        if(map[i][j] == 'J'){
          q.add(new int[]{i, j});
          visited[i][j] = true;
        }
        if(map[i][j] == 'F'){
          fire.add(new int[]{i, j});
        }
      }
    }

    int time = 0;
    while(!q.isEmpty()){
      time++;
      int size = fire.size();
      for(int i=0; i<size; i++){
        int[] cur = fire.poll();
        for(int k=0; k<4; k++){
          int nx = cur[0] + dx[k];
          int ny = cur[1] + dy[k];
          if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
          if(map[nx][ny] == '#' || map[nx][ny] == 'F') continue;
          map[nx][ny] = 'F';
          fire.add(new int[]{nx, ny});
        }
      }

      size = q.size();
      for(int i=0; i<size; i++){
        int[] cur = q.poll();
        for(int k=0; k<4; k++){
          int nx = cur[0] + dx[k];
          int ny = cur[1] + dy[k];
          if(nx < 0 || nx >= r || ny < 0 || ny >= c){
            System.out.println(time);
            return;
          }
          if(visited[nx][ny] || map[nx][ny] == '#' || map[nx][ny] == 'F') continue;
          visited[nx][ny] = true;
          q.add(new int[]{nx, ny});
        }
      }
    }
    System.out.println("IMPOSSIBLE");
  }
}