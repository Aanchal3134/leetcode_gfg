class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        while(str.indexOf(part) != -1) {
            int idx = str.indexOf(part);
            str.delete(idx, idx + part.length());
        }
        return str.toString();
    }
}