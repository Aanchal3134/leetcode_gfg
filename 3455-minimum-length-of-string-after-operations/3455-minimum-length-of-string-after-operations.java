class Solution {
    public int minimumLength(String s) {
        //METHOD 2 - HASHMAPS
        HashMap<Character, Integer> count = new HashMap<>();
        for(char c : s.toCharArray()) { //store the char and their freq in hashmap count
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        int minus = 0;
        for(int value : count.values()) { 
            while(value >= 3) {
                minus += 2;
                value -= 2;
            }
        }
        return s.length() - minus;
    }
}