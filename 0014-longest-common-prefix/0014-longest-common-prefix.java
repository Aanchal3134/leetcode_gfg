class Solution {
    public String longestCommonPrefix(String[] strs) {
        //from solutions
        //sort the array
        //for longest common prefix - check for first and last elem in array

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i = 0; //index

        while(i < s1.length() && i < s2.length()) {
            if(s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }

        return s1.substring(0, i);
    }
}