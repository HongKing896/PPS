class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] seen = new boolean[n];

        for( int i = 2; i < n; i++ ) {
            if( seen[i] ) continue;
            count ++;
            for( long multi = (long)i*i; multi < n; multi += i ) {
                seen[(int)multi] = true;
            }
        }
        return count;
    }
}