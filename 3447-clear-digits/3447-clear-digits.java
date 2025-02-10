class Solution {
    public String clearDigits(String s) { //OPTIMIZED APPROACH - 
        StringBuilder str = new StringBuilder(); //initialise empty stringbuilder

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) && str.length() != 0) {
                str.setLength(str.length()-1);
            } else {
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }
}