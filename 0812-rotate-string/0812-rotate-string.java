class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
//MY Approach- USE .euals not ==
        int n = s.length();
        

        StringBuilder str = new StringBuilder(s);

        for(int i=0; i<n; i++) {
        
            str.append(str.charAt(0));
            str.deleteCharAt(0);
        
            if(str.toString().equals(goal)) return true;
            
        }

        return false;
    }
}