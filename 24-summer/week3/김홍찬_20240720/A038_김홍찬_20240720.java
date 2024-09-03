class Solution {
    public int mySqrt(int x) {
        //제곱근 구해서 소수점 버림
        //바이너리 서치로 중간부터 구해야함
        if( x == 0 || x == 1 ) return x;

        int first = 1,last = x;

        while ( first <= last ) {
            int mid = first + (last - first)/2;
            if( mid == x/mid ) return mid;
            else if ( mid > x/mid ) last = mid -1;
            else first = mid + 1;
        }
        return last;
    }
}