
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        Main baekJoon = new Main();
        baekJoon.no8958();
    }

    void no8958() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int j = 0; j < N; j++){
            String str = br.readLine();
            int score = 0;
            int count = 0;
            for( char c : str.toCharArray() ){
                if( c == 'O'){
                    count++;
                    score += count;
                }else count = 0;
            }
            System.out.println(score);
        }
    }
}
