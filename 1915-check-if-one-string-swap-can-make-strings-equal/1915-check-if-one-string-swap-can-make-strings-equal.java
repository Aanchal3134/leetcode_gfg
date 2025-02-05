class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int n = s1.length();
        int unMatched = 0;
        int[] idx = new int[2];
        int j = 0;

        for(int i=0; i<n; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                unMatched++;
                if(unMatched <=2) idx[j++] = i;
            }
        }

        if(unMatched != 2 && unMatched != 0) return false;

        if(s1.charAt(idx[0]) == s2.charAt(idx[1]) && s1.charAt(idx[1]) == s2.charAt(idx[0])) return true;
        
        return false;
    }
}