class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            int[] freq = new int[26]; //new freq arr for each char vali substrings
            for(int j=i; j<s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                sum += beauty(freq);
            }
        }

        return sum;
    }

    public int beauty(int[] freq) {
        int minG = Integer.MAX_VALUE;
        int maxG = Integer.MIN_VALUE;

        for(int count : freq) {
            if(count > 0) {
                minG = Math.min(minG, count);
                maxG = Math.max(maxG, count);
            }
        }

        return maxG - minG;
    }
}