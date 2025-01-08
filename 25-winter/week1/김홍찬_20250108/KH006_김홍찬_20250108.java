//https://www.acmicpc.net/problem/13300
import java.io.*;
import java.util.*;

class Main{
        public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //방 배정
        baekjoon.no13300();
        }

    void no13300() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] a = new int[2][7];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            a[S][Y]++;
        }
        int room = 0;
        for(int i = 1; i < 7; i++){
            for(int j = 0; j< 2; j++){
                if(a[j][i] > 0){
                    room += (a[j][i] + K - 1)/ K;
                }
            }
        }
        System.out.print(room);
    }
}