import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //완주하지 못한 선수
        programmers.no42576();
    }

    void no42576(){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = "";

        //참가자 이름과 빈도수를 저장할 해시맵
        HashMap<String,Integer> freq = new HashMap<>();

        //참가자 명단을 해시맵에 저장
        for(String name : participant){
            freq.put(name, freq.getOrDefault(name,0) + 1);
        }

        //완주자 명단을 해시맵에서 빼기
        for(String name : completion){
            freq.put(name, freq.get(name) - 1);
        }

        //빈도수가 0이 아닌 이름을 찾아서 출력
        for(String name : freq.keySet() ){
            if(freq.get(name) > 0){
                answer = name;
                break;
            }
        }

        System.out.println(answer);
    }
}