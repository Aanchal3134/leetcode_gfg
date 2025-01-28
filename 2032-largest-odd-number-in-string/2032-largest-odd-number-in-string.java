class Solution {
    public String largestOddNumber(String num) {
        //ans from solution sec

        //find the first odd digit from the end
        for(int i=num.length()-1; i>=0; i--) {
            int dig = num.charAt(i) - '0';
            if(dig % 2 != 0) {
                return num.substring(0, i+1);
            }
        }

        return "";
    }
}