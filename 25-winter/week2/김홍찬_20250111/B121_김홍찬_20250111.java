//https://www.acmicpc.net/problem/17298
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        Main beakjoon = new Main();
        //오큰수
        beakjoon.no17298();
    }
    
    void no17298() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] res = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> NGE = new Stack<>();
        for(int i=N-1; i>=0; i--){
            while(!NGE.isEmpty() && NGE.peek()<=arr[i]) NGE.pop();
            if(NGE.isEmpty()) res[i] = -1;
            else res[i] = NGE.peek();
            NGE.push(arr[i]);
        }
        for(int n : res) sb.append(n).append(" ");
        System.out.print(sb);
    }
}