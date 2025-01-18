class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        int[] count = new int[26];
        for(int i=0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            count[ch - 'a']++;
        }

        for(int i : count) {
            if(i == 0) {
                return false;
            }
        }

        return true;
    }
}