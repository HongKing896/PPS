class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        ArrayList<Character> sList = new ArrayList<>();
        ArrayList<Character> tList = new ArrayList<>();

        for( char ch : sArray ) {
            if( ch == '#' ) {
                if( sList.size() > 0 ) sList.remove( sList.size() - 1 );
            } else sList.add(ch);
        }
        for( char ch : tArray ) {
            if( ch == '#' ) {
                if ( tList.size() > 0 ) tList.remove( tList.size() - 1 );
            } else tList.add(ch);
        }

        if( sList.equals(tList) ) return true;
        else return false;
    }
}