class Solution {
    public boolean lemonadeChange(int[] bills) {
        // 잔돈 배열 선언 0=5  1=10
        //bills[i] == 5, 잔돈[0] ++
        //bills[i] == 10, 1) 잔돈[0] == 0, false 2)잔돈[0] --, 잔돈[1]++
        //bills[i] == 20, 1) 잔돈[1] == 0 && , 2)번으로, 잔돈[0]-- ,잔돈[1] -- 잔돈[0] -= 3   2) 잔돈[0]-- ,잔돈[1] --

        int[] changes = new int[2];

        for( int i = 0; i < bills.length; i++ ) {
            if( bills[i] == 5 ) changes[0]++;
            if( bills[i] == 10 ) {
                if( changes[0] > 0 ) {
                    changes[0]--;
                    changes[1]++;
                } else return false;
            }
            if( bills[i] == 20 ) {
                if( changes[1] > 0 && changes[0] > 0 ) {
                    changes[0]--;
                    changes[1]--;
                } else if ( changes[0] >=3 ) {
                    changes[0] -= 3;
                } else return false;
            }
        }
        return true;
    }
}