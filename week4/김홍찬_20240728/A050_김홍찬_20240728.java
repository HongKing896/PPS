
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no5598();
    }

    void no5598() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c == 'A' || c == 'B' || c == 'C'){
                sb.append((char)('X' - ('A'-c)));
            } else sb.append((char)(c - 3));
        }
        System.out.println(sb);
    }
}
