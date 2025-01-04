import java.util.*;

class Main {
    public static void main(String[] args) {
        Main programmers = new Main();
        //폰켓몬
        programmers.no1845();
    }

    void no1845(){
        int[] nums = {3,1,2,3};
        int answer = 0;

        //중복을 제거한 배열
        HashSet<Integer> races = new HashSet<>();
        for(int num : nums){
            races.add(num);
        }

        //중복을 제거한 배열의 길이와 nums의 길이를 비교
        answer = Math.min(races.size(), nums.length/2);

        System.out.println(answer);
    }
}