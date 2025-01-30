class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String res = "";

        int n = str.length;

        for(int i=n-1; i>=1; i--) {
            res += str[i] + " ";
        }

        //last elem
        res += str[0];

        return res;
    }
}