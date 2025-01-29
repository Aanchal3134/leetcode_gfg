class Solution {
    public boolean isIsomorphic(String s, String t) {
        //MY SOLUTION
        if(s.length() != t.length()) return false;
        int n = s.length();

        Map<Character, Character> store = new HashMap<Character, Character>();

        for(int i=0; i<n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(store.containsKey(ch1)) {
                char val = store.get(ch1);
                if(ch2 == val) {
                    continue;
                } else {
                    return false;
                }
            } else if(store.containsValue(ch2)) {
                return false; //if value is present but not the key 
            }
            else {
                store.put(ch1, ch2);
            }
        }

        return true;
    }
}