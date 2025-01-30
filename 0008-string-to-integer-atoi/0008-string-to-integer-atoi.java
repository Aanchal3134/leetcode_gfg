class Solution {
    public int myAtoi(String s) {
        boolean positive = true;
        
        int res = 0;
        int maxDiv = Integer.MAX_VALUE / 10;

        s = s.trim();

        if(s.isEmpty() || s.length() == 0) return 0;

        int i = 0;

        if(s.charAt(0) == '-') {
            positive = false;
            i++;
        } else if(s.charAt(0) == '+') {
            i++;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int dig = s.charAt(i) - '0';
            if(res > maxDiv || (res == maxDiv && dig > 7)) {
                return (positive) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + dig;
            i++;
        }

        return (positive) ? res : -res;
    }
}