class Solution {
    public int heightChecker(int[] heights) {
        //솔팅 하고 두 어레이 비교
        int[] sorted = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int count = 0;
        for ( int i = 0; i < sorted.length; i++ ) {
            if ( heights[i] != sorted[i] ) {
                count++;
            }
        }
        return count;
    }
}