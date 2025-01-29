class Solution {
    public boolean isPerfectSquare(int num) {
        // 바이버리 서치를 쓸 수 있어 보임
        // 반나누어서 미들의 제곱이 딱떨어 지는 것이 있으면 트루 없으면 폴스

        int start = 1, end = num;
        while ( start <= end ) {
            int mid = start + (end - start)/2;
            if ( (long)mid * (long)mid == num ) return true;
            else if ( (long)mid * (long)mid> num ) end = mid -1;
            else start = mid + 1;
        }
        return false;
    }
}