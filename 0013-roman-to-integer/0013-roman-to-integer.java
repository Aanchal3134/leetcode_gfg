class Solution {
    public int romanToInt(String s) {
        int n = s.length();
       

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res =0;

        for(int i=0; i<n-1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(map.get(ch1) >= map.get(ch2)) {
                res += map.get(ch1);
            } else {
                res -= map.get(ch1);
            }
        }

        //last elem
        res += map.get(s.charAt(n-1));

        return res;
    }
}