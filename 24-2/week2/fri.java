// 24/09/06

//leetcode
//https://leetcode.com/problems/pascals-triangle/description/
//Level: Easy
//이전에 풀어봄: O

//줄의 개수만큼 반복 1부터 시작
//인덱스 만큼 반복
//l[0][0] = 1
//l[1][0] = 1, l[1][1] = 1
//l[2][0] = 1, l[2][1] = 2, l[2][2]= 1
//l[3][0] = 1, l[3][1] = 3, l[3][2] = 3, l[3][3] = 1
//마지막과 시작은 1
//중간은 l[i-1][j-1] = l[i-1][j]

// 1차 시도
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> res = new ArrayList<>();
//         if(numRows == 0) return res;
//         for(int i = 1; i <= numRows; i++){
//             for(int j = 0; j < i; j++){
//                 if(j == 0 || j == i-1){
//                     res.add(1);
//                 } else {
//                     res.add(res[i-1][j-1] + res[i-1][j]);
//                 }
//             }
//         }
//         return res;
//     }
// }

//2차 시도
//리스트 접근 문법이 틀림
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> res = new ArrayList<>();
//         if(numRows == 0) return res;
//         for(int i = 1; i <= numRows; i++){
//             for(int j = 0; j < i; j++){
//                 if(j == 0 || j == i-1){
//                     res.get(i-1).add(1);
//                 } else {
//                     res.get(i-1).add(res.get(i-2).get(j-1) + res.get(i-2).get(j));
//                 }
//             }
//         }
//         return res;
//     }
// }

//3차시도
//바깥 리스트에 내부리스트 오브젝트 생성후 할당
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        for(int i = 1; i <= numRows; i++){
            List<Integer> now = new ArrayList<>();
            res.add(now);
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i-1){
                    res.get(i-1).add(1);
                } else {
                    res.get(i-1).add(res.get(i-2).get(j-1) + res.get(i-2).get(j));
                }
            }
        }
        return res;
    }
}

//Start: 18:20
//End: 18:45
//총: 25분
//혼자 해결: O
//나의 난이도 평가: Easy

//다른풀이
// class Solution {
//     public static ArrayList<Integer> generatedRow(int rows) {
//         long ans = 1;
//         ArrayList<Integer> ansRow = new ArrayList<>();
//         ansRow.add(1);
//         for (int cols = 1; cols < rows; cols++) {
//             ans = ans * (rows - cols);
//             ans = ans / cols;
//             ansRow.add((int) ans);
//         }
//         return ansRow;
//     }

//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> ans = new ArrayList<>();
//         for (int i = 1; i <= numRows; i++) {
//             ans.add(generatedRow(i));
//         }
//         return ans;
//     }
// }
// 내부에 줄을 생성하는 새로운 함수 선언