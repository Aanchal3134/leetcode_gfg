class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[126];
        char[] ans = new char[s.length()];

        //cal freq using freq array
        for(char ch : s.toCharArray()) {
            freq[ch]++;
        }

        //find largest freq and append to ans
        for(int i=0; i<s.length(); ) {
            //find the greatest value and its index
            int max = 0;
            int idx = 0;

            for(int j=0; j<126; j++) {
                if(max < freq[j]) {
                    max = freq[j];
                    idx = j;
                }
            }

            //reduce the value while appending the char in ans
            while(freq[idx] > 0) {
                ans[i++] = (char) idx;
                freq[idx]--;
            }
        }

        return new String(ans);
    }
}