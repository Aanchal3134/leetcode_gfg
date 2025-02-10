class Solution {
    public String clearDigits(String s) { //FROM EDITORIAL
        StringBuilder str = new StringBuilder(s);
        
        int i = 0;

        while(i < str.length()) {
            if(Character.isDigit(str.charAt(i))) {
                str.deleteCharAt(i); //no update in i

                if(i > 0) {
                    str.deleteCharAt(i-1);
                    i--; 
                }
            } else {
                i++;
            }
        }

        return str.toString();
    }
}