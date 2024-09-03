
import java.util.StringTokenizer;

class Solution {
    public int dayOfYear(String date) {
        StringTokenizer st = new StringTokenizer(date,"-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int count = 0;
        for(int i = 0; i < month-1; i++){
          if(isLeap(year) && i == 1 ) {
            count += 29;
          } else count += days[i];
        }
        count += day;

        return count;
    }
    boolean isLeap( int year ){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}