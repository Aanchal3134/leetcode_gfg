class Solution {
    public int maximumSwap(int num) {
        //find largest digit - bring it to first place
        String str = Integer.toString(num);
        char[] newArr = str.toCharArray();
        int n = newArr.length;

        int[] lastIdx = new int[10];
        //traverse number to store the index at which digits occured
        for(int i=0; i<n; i++) {
            lastIdx[newArr[i] - '0'] = i;
        }

        //swap when larger digit appear
        for(int i=0; i<n; i++) {
            for(int d=9; d> (newArr[i] - '0'); d--) {
                if(lastIdx[d] > i) { //i is current index
                    //swap
                    char temp = newArr[i];
                    newArr[i] = newArr[lastIdx[d]];
                    newArr[lastIdx[d]] = temp;
                    return Integer.parseInt(new String(newArr));
                }
            }
        }
        return num; //if no swap
    }
}