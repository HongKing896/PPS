class Solution {
    public String removeOuterParentheses(String s) {
        //나뉘어 질 수 있는 덩어리들 중에 가장 바깥에 있는 괄호 한 묶음을 벗겨내어라
        //(아우터 괄호 열림 상태)에서 여는 괄호 나오면 (이너 괄호 카운트++ ) 스트링에 삽입
        //닫는 괄호가 나왔을 때 이너 괄호 카운트 --, 이너괄호 카운트가 == 0 이면 스트링에 넣음

        String result = "";
        boolean outer = false;
        int inner = 0;
        char[] str = s.toCharArray();

        for ( char ch : str ) {
            if( ch == '(' ) {
                if ( outer ) {
                    inner++;
                    result += ch;
                    }
                else outer = true;
            } else {
                if ( inner == 0 ) outer = false;
                else {
                    inner --;
                    result += ch;
                }
            }
        }
        return result;
    }
}