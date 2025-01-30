class Solution {
    public int maxDepth(String s) { //my sol
        int count = 0;
        int max = 0;

        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                count++;
            } else if(ch == ')') {
                if(count > 0) count--;
            } else {
                continue;
            }

            max = Math.max(count, max);
        }

        return max;
    }
}