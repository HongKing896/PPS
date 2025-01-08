//https://www.acmicpc.net/submit/10807
import java.io.*;
import java.util.*;

class Main{
        public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //개수 세기
        baekjoon.no10807();
        }

    void no10807() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[201];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            if(n > 0) a[n+100]++;
            else a[n*-1]++;
        }
        int x = Integer.parseInt(br.readLine());
        if(x > 0) System.out.print(a[x+100]);
        else System.out.print(a[x*-1]);
        
    }
}