class Solution {
    public int[] plusOne(int[] digits) {
        //가장 오른쪽 숫자가 0~8이라면 1증가 리턴 
        //아니라면 현재숫자 0
        //길이만큼 반복
        //첫번째 숫자가 9라면 두번째 인덱스에 0 삽입 첫번째 숫자 1
        int[] newArray;
        for(int i = digits.length-1; i > -1; i-- ) {
            if( digits[i] != 9) {
                digits[i] ++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            digits[0] = 1;
            newArray = new int[digits.length + 1];
            newArray = insert(digits,0,1);
        } else {
            newArray = new int[digits.length];
            newArray = digits;
        }
        return newArray;
    }
    public static int[] insert(int[] origin, int newElement, int position) {
        int length = origin.length;
        int[] newArray = new int[length + 1];

        System.arraycopy(origin,0,newArray,0,position);
        newArray[position] = newElement;
        System.arraycopy(origin,position,newArray,position+1,length - position);

        return newArray;
    }
}
    