class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        //솔팅을 한후에
        Arrays.sort(g);
        Arrays.sort(s);
        //이중 반복을 하면서
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < s.length; j++){
                //아이가 쿠키를 안 받았거나 쿠키가 할당 될 수 있으면
                if( g[i] != 0 && g[i] <= s[j]){
                    //할당 카운트를 올리고
                    count++;
                    //쿠키와 아이를 제거한다.
                    s[j] = 0;
                    g[i] = 0;
                    //쿠키 찾는 반복을 중단한다.
                    break;
                }
            }
        }
        return count;  
    }
}