// 24/09/05

//leetcode
//https://leetcode.com/problems/assign-cookies/
//Level: Easy
//이전에 풀어봄: O

//1차시도
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         //솔팅후 인덱스를 양 배열에 두어 전진시키면서 배정된 개수를 센다
//         int[] children = g;
//         int[] cookies = s;
//         Arrays.sort(children);
//         Arrays.sort(cookies);
//         int i = 0;
//         int j = 0;
//         int count=0;
//         while(i >= children.length || j >= cookies.length){
//           if(cookies[j] >= children[i]){
//             count++;
//             i++;
//             j++;
//           } else j++;
//         }
//         return count;
//     }

//2차시도
//while 조건문 수정 부호 변경
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         //솔팅후 인덱스를 양 배열에 두어 전진시키면서 배정도니 개수를 센다
//         int[] children = g;
//         int[] cookies = s;
//         Arrays.sort(children);
//         Arrays.sort(cookies);
//         int i = 0;
//         int j = 0;
//         int count=0;
//         while(i <= children.length && j <= cookies.length){
//           if(cookies[j] >= children[i]){
//             count++;
//             i++;
//             j++;
//           } else j++;
//         }
//         return count;
//     }
// }

//2차시도
//while 조건문 수정 "=" 삭제
import java.util.Arrays;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //솔팅후 인덱스를 양 배열에 두어 전진시키면서 배정도니 개수를 센다
        int[] children = g;
        int[] cookies = s;
        Arrays.sort(children);
        Arrays.sort(cookies);
        int i = 0;
        int j = 0;
        int count=0;
        while(i < children.length && j < cookies.length){
          if(cookies[j] >= children[i]){
            count++;
            i++;
            j++;
          } else j++;
        }
        return count;
    }
}

//Start: 21:19
//End: 21:40
//총: 21분
//혼자 해결: O
//나의 난이도 평가: Easy

//다른 풀이
// Arrays.sort(g);
// Arrays.sort(s);
// int i = 0;
// for(int j=0;i<g.length && j<s.length;j++) {
// 	if(g[i]<=s[j]) i++;
// }
// return i;

//논리 자체는 비슷하나 주어진 배열을 정렬하여서 data가 mutate됨 그래서 본인은 새 배열을 만듬