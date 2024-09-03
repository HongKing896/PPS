import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no11721();
    }

    void no11721() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i = 0; i < str.length(); i += 10){
            int end = Math.min(i + 10, str.length());
            String out = str.substring(i,end);
            System.out.println(out);
        }
    }
}
