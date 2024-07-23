class Solution {
    public List<String> summaryRanges(int[] nums) {
        //스트링 어레이 리스트
        //반복하면서 첫번째 값 넣고 다음값과 연속되는지 비교
        //되면 넘어가고 안되면 닫고 어레이리스트에 넣고 다음 끝까지

        List<String> result = new ArrayList<String>();
        String making ="";
        for( int i = 0; i < nums.length; i++ ) {
            if( i < nums.length-1 && nums[i]+1 == nums[i+1] ) {
                if( making .contains("->") ) continue;
                else making += Integer.toString(nums[i]) + "->";
            } else {
                making += Integer.toString(nums[i]);
                result.add(making);
                making = "";
            }
        }
        return result;
    }
}