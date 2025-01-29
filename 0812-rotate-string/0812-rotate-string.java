class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        if((s + s).contains(goal)) return true;

        return false;


        // int n = s.length();
        // int i = 0;

        // StringBuilder str = new StringBuilder();

        // while (i<n) {
        //     // char ch = str.charAt(0);
        //     s = s.substring(1, n) + s.substring(0, 1);
        //     // str.append(ch);
        //     if(s == goal) return true;
        //     i++;
        // }

        // return false;
    }
}