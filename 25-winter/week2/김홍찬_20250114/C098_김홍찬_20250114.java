//https://school.programmers.co.kr/learn/courses/30/lessons/42839
import java.util.*;

class Main{
    public static void main(String[] args) {
        Main programmers = new Main();
        //소수 찾기
        String numbers = "17";
        int answer = programmers.solution(numbers);
        
        System.out.print(answer);
    }
    
    void permutations(String prefix, String str, Set<Integer> result) {
        if (!prefix.isEmpty()) {
            result.add(Integer.parseInt(prefix)); // 숫자로 변환하여 중복 제거
        }
        for (int i = 0; i < str.length(); i++) {
            permutations(
                prefix + str.charAt(i),
                str.substring(0, i) + str.substring(i + 1),
                result
            );
        }
    }

    boolean isPrime(int num){
        boolean[] p = new boolean[num+1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;
        
        for(int i=2; i*i <= num; i++){
            if(p[i]){
                for(int j=i*i; j*j <= num; j++){
                    p[j] = false;
                }
            }
        }
        return p[num];
    }

    int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        permutations("", numbers, set);
        
        for(int num : set){
            if(isPrime(num)){
                answer++;
            }
        }

        return answer;
    }
}