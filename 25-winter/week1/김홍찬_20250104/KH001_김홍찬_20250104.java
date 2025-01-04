import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //아 맞다 마늘
        baekjoon.no32978();
    }
    
    void no32978() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> ingredients = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ingredients.add(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            ingredients.remove(st.nextToken());
        }
        System.out.println(ingredients.iterator().next());
    }
}