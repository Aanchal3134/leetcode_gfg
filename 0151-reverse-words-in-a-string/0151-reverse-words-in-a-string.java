class Solution {
    public String reverseWords(String s) {
        //solution section

        //split str into array of words
        String[] str = s.trim().split("\\s+");
        String res = "";

        for(int i=str.length-1; i > 0; i--) {
            res += str[i] + " ";
        }

        //last elem
        res += str[0]; //without trailing space

        return res;

    }
}