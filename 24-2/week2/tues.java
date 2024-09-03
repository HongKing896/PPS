//24/09/02

//programmers
//https://school.programmers.co.kr/learn/courses/30/lessons/49993?language=java
//Level: Easy

//배열 반복
//문자열 반복
    //해당글자가 skill에 있으면
        // skill[i] 와 같으면 통과
        //아니면 다음 배열
    //없으면 통과
//카운트 ++

//1차 시도
// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = -1;
//         if(skill.length() == 0 || skill_trees == 0) return answer;
//         answer = 0;
//         boolean flag = true;
//         for(String tree : skill_trees){
//             int curr = 0;
//             for(int i = 0; i < tree.length(); i++){
//                 if(skill.contains(tree[i])){
//                     if(tree[i] == skill[curr]) curr++;
//                     else {
//                         flag = false;
//                         break;
//                     }
//                 }
//             }
//             if(flag) answer++;
//         }
//         return answer;
//     }
// }

//2차시도
//length(),size,charAt등등 문법을 틀려서 다시작성
//chatGPT에게 "skill 이라는 String에  String tree의 i 번쨰 인덱스가 포함되어 있는지 검사하고 싶어" 라고 물어보고 if (skill.contains(String.valueOf(tree.charAt(i)))) 조건문 작성
//
// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = -1;
//         if(skill.length() == 0 || skill_trees.length == 0) return answer;
//         answer = 0;
//         boolean flag = true;
//         for(String tree : skill_trees){
//             int curr = 0;
//             for(int i = 0; i < tree.length(); i++){
//                 if (skill.contains(String.valueOf(tree.charAt(i)))) {
//                     if(tree.charAt(i) == skill.charAt(curr)) curr++;
//                     else {
//                         flag = false;
//                         break;
//                     }
//                 }
//             }
//             if(flag) answer++;
//         }
//         return answer;
//     }
// }

//3차시도
//GPT에게 물어봄 -> flag 정의 위치가 반복문 바깥이라 초기화가 제대로 되지않음
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = -1;
        if(skill.length() == 0 || skill_trees.length == 0) return answer;
        answer = 0;
        for(String tree : skill_trees){
            int curr = 0;
            boolean flag = true;
            for(int i = 0; i < tree.length(); i++){
                if (skill.contains(String.valueOf(tree.charAt(i)))) {
                    if(tree.charAt(i) == skill.charAt(curr)) curr++;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;
        }
        return answer;
    }
}
//Start: 20:35
//End: 21:14
//총: 39분
//혼자 해결: X
//나의 난이도 평가: Easy



//다른 풀이 1
// import java.util.*;
// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
//         ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
//         //ArrayList<String> skillTrees = new ArrayList<String>();
//         Iterator<String> it = skillTrees.iterator();

//         while (it.hasNext()) {
//             if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                 it.remove();
//             }
//         }
//         answer = skillTrees.size();
//         return answer;
//     }
// }

//ArrayList로 변환하고 정규표현식을 사용하여 문자열을 처리하고 Iterator의 사용하여 반복을 최소화 한 것으로 보입니다.

//몰랐던 함수
//String.indexOf(String or Character)
//String.replaceAll(Regex, String)

//다른풀이 2
// import java.util.Arrays;
// class Solution {
//     public static int solution(String skill, String[] skill_trees) {
//         String regex = "[^" + skill + "]";
//         return (int) Arrays.stream(skill_trees)
//                 .filter(tree -> skill.startsWith(tree.replaceAll(regex, ""))).count();
//     }
// }

// stream().filter 식을 이용