class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> prev = new ArrayList<>();
        int sum = 0;
        int point;
        for( int i = 0; i < operations.length; i ++ ) {
            if( operations[i].equals("+") ) {
                point = prev.get(prev.size()-1) + prev.get(prev.size() -2);
                sum += point;
                prev.add(point);
            } else if ( operations[i].equals("D") ) {
                point = prev.get(prev.size()-1) * 2;
                sum += point;
                prev.add(point);
            } else if ( operations[i].equals("C") ) {
                sum -= prev.get(prev.size()-1);
                prev.remove(prev.size()-1);
            } else {
                point = Integer.parseInt(operations[i]);
                sum += point;
                prev.add(point);
            }
        }
        return sum;
    }
}