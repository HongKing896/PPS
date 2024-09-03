class Solution {
    public boolean isPowerOfFour(int n) {
        if( n == 1) return true;
        for( long i = 1; i < n+1; i *= 4) {
            if( i == n ) return true;
        }
        return false;
    }
}