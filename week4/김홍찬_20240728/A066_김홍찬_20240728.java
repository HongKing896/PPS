
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no11650();
    }

    void no11650() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Arrays.sort(str);
        StringBuilder sb = new StringBuilder(new String(str));
        sb.reverse();
        System.out.println(sb);
    }
}
