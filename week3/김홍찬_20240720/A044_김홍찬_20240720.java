class Solution {
    public boolean checkRecord(String s) {
        //반복을 돌면서 글자 검사 
        //1)P: 통과,L카운트0
        //2)A: A카운트 증가,L카운트 0(2이상시 false리턴) 
        //3)L: L카운트 증가 (L 3일 이상 false 리턴)

        int aCount = 0;
        int lCount = 0;
        char[] str = s.toCharArray();
        for ( char ch : str ) {
            if ( ch == 'A' ) {
                aCount++;
                lCount = 0;
                if( aCount >= 2 ) return false;
            } else if ( ch =='L') {
                lCount++;
                if( lCount >= 3 ) return false;
            } else lCount = 0;
        }
        return true;
    }
}