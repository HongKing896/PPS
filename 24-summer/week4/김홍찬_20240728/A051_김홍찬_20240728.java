
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no5622();
    }

    void no5622() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        int[] nc = {
            3,3,3,
            4,4,4,
            5,5,5,
            6,6,6,
            7,7,7,
            8,8,8,8,
            9,9,9,
            10,10,10,10
            };
        for(char c : str.toCharArray()){
            sum += nc[c-'A'];
        }

        System.out.println(sum);
    }
}