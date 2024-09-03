import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        if (numRows == 0) {
            return out;
        }
        out.add(List.of(1));

        for( int i = 1; i < numRows; i++ ) {
            List<Integer> preInner = out.get(i -1);
            List<Integer> nowInner = new ArrayList<Integer>();
            nowInner.add(1);
            for (int j = 1; j < i; j++) {
                    nowInner.add(preInner.get(j-1) + preInner.get(j));
            }
            nowInner.add(1);
            out.add(nowInner);
        }
        return out;
    }
}