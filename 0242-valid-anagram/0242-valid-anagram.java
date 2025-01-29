class Solution { //MY SOLUTION
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 97]++;
        }

        for(char ch : t.toCharArray()) {
            if(freq[ch - 97] == 0) {
                return false;
            } else {
                freq[ch-97]--;
            }
        }


        for(int i=0; i<26; i++) {
            if(freq[i] != 0) return false;
        }

        return true;
    }
}