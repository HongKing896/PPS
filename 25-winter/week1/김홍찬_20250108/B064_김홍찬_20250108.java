//https://www.acmicpc.net/submit/3273
import java.io.*;
import java.util.*;

class Main{
        public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //두 수의 합
        baekjoon.no3273();
        }

    void no3273() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 1) {
            System.out.print("0");
            return;
        }
        int[] a = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());
        int cnt = 0, L = 0, R = N-1, sum;
        Arrays.sort(a);
        while(L<R){
            sum = a[L] + a[R];
            if(sum == x){
                cnt++;
                L++;
                R--;
            }else if(sum < x){
                L++;
            }else{
                R--;
            }
        }
        System.out.print(cnt);
    }
}