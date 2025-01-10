class Solution { //saw from solutions section
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> list = new ArrayList<>();
        int[] tempfreq = new int[26];
        int[] maxfreq = new int[26];

//CHECK FOR ARRAY 2 - WORDS2 AND STORE THE FREQ OF ALL CHARS
        for(String word : words2) {
            Arrays.fill(tempfreq, 0);
            for(char ch : word.toCharArray()) {
                tempfreq[ch - 'a']++;
            }

            for(int i=0; i<26; i++) {
                maxfreq[i] = Math.max(maxfreq[i], tempfreq[i]);
            }
        }

        //CHECK FOR CHARS IN WORDS1 I.E ARRAY 1
        for(String word : words1) {
            boolean universal = true;
            Arrays.fill(tempfreq, 0);
            for(char ch : word.toCharArray()) {
                tempfreq[ch - 'a']++;
            }

            for(int i=0; i<26; i++) {
                if(maxfreq[i] > tempfreq[i]) {
                    universal = false;
                    break;
                }
            }

            if(universal) {
                list.add(word);
            }
        }

        
        return list;
    }
}