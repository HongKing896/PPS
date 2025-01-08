//https://www.acmicpc.net/problem/11328
import java.io.*;
import java.util.*;

class Main{
        public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //Strfry
        baekjoon.no11328();
        }

    void no11328() throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            if(a.length() != b.length()){
                sb.append("Impossible").append("\n");
                continue;
            }
            int[] c = new int[26];
            for(int j = 0; j < a.length(); j++){
                c[a.charAt(j) - 'a']++;
                c[b.charAt(j) - 'a']--;
            }
            boolean check = true;
            for(int j = 0; j < 26; j++){
                if(c[j] != 0){
                    check = false;
                    break;
                }
            }
            if(check) sb.append("Possible").append("\n");
            else sb.append("Impossible").append("\n");
        }
        System.out.print(sb);
    }
}