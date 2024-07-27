
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no10828();
    }

    void no10828() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        StringTokenizer st;
        for(int j = 0; j < N; j++){
            String str = br.readLine();
            if(str.contains("push")){
                st = new StringTokenizer(str);
                st.nextToken();
                stack.add(Integer.parseInt(st.nextToken()));
            }
            if(str.contains("pop")){
                if(stack.isEmpty())System.out.println(-1);
                else System.out.println(stack.remove(stack.size()-1));
            }
            if(str.contains("size")){
                System.out.println(stack.size());
            }
            if(str.contains("empty")){
                if(stack.isEmpty())System.out.println(1);
                else System.out.println(0);
            }
            if(str.contains("top")){
                if(stack.isEmpty())System.out.println(-1);
                else System.out.println(stack.get(stack.size()-1));
            }
        }
    }
}
