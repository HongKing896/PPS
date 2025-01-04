import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Main baekjoon = new Main();
        //할리갈리
        baekjoon.no27160();
    }
    void no27160() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> cardNums = new HashMap<>();
        cardNums.put("STRAWBERRY",0);
        cardNums.put("BANANA",0);
        cardNums.put("LIME",0);
        cardNums.put("PLUM",0);

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String card = st.nextToken();
            cardNums.put(card,cardNums.get(card) + Integer.parseInt(st.nextToken()));
        }
        for(String card : cardNums.keySet() ){
            if(cardNums.get(card) == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}