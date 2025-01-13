class Solution {
    public int minimumLength(String s) {
        //use freq array - hashtable - METHOD 1
        int totalLength = 0;
        int[] freqArr = new int[26]; ///store freq if letters

        for(char c : s.toCharArray()) {
            freqArr[c - 'a']++;
        }

        for(int f : freqArr) {
            if(f == 0) continue;
            if(f % 2 == 0) { //if char freq is even then 2 char t=will remain in string
                totalLength += 2;
            } else { //odd freq char - 1 char will remain
                totalLength += 1;
            }   
        }     
        return totalLength;
    }
}