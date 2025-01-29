class Solution {
    public String longestCommonPrefix(String[] strs) {
        //첫문장을 두번째문장을 앞에서 부터 비교 같은 글자가나오면 중단 처음부터 중단되면 반복 종료 프리픽스문장을 그것으로 교체
        //프리픽스 문장과 다음 문장을 프리픽스문장의 처음부터 비교 다른글자가 나오면 중단 처음부터 중단 되면 반복종료

        char[] prefix = strs[0].toCharArray();
        for ( String str : strs ) {
            char[] chArray = str.toCharArray();
            if( prefix.length > chArray.length ) {
                 prefix = Arrays.copyOf(prefix,chArray.length);
            }
            for( int i = 0; i < prefix.length; i++ ) {
                if ( chArray[i] != prefix[i] ) {
                    prefix = Arrays.copyOf(prefix,i);
                    break;
                }
            }
        }
        String result = new String(prefix);
        return result;
    }
}