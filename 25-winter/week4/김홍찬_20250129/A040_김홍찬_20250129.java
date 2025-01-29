class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int half = s.length()/2;
        String first = s.substring(0,half);
        String last = s.substring(half);
        int fCount = 0, lCount = 0;

        for( int i = 0; i < first.length(); i++ ) {
            if( first.charAt(i) == 'a' || first.charAt(i) == 'e' || first.charAt(i) == 'i' || first.charAt(i) == 'o' || first.charAt(i) == 'u' ) {
                fCount++;
            }
        }
        for( int i = 0; i < last.length(); i++ ) {
            if( last.charAt(i) == 'a' || last.charAt(i) == 'e' || last.charAt(i) == 'i' || last.charAt(i) == 'o' || last.charAt(i) == 'u' ) {
                lCount++;
            }
        }

        if ( fCount == lCount ) return true;
        else return false;
    }
}