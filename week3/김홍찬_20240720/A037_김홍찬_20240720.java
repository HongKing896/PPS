class Solution {
    public boolean isPowerOfFour(int n) {
        if( n == 1) return true;
        for( long i = 1; i < n+1; i *= 4) {
            if( i == n ) return true;
        }
        return false;
    }
}class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //각 자릿수로 해당 수가 나누어 떨어지면 자기 분할 수이다.
        //좌부터 우로 한칸씩 가면서 자릿수로 해당 숫자를 나누어 나누어 떨어지면 해당 수를 리스트에 넣는다.

        List<Integer> result = new ArrayList<Integer>();
        for ( int i = left; i <= right; i++ ) {
            int num = i;
            boolean add = true;
            while( num > 0 ){
                int remain = num%10;
                 if (remain == 0 || i % remain != 0) {
                    add = false;
                    break;
                }
                num /= 10;
            }
            if( add ) {
                result.add(i);
            }
        }
        return result;
    }
}