class Solution {//hashmap
    public long countBadPairs(int[] nums) {
        long bp = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int diff = i - nums[i];
            //total pairs till i=3 for eg are 3
            //bp = total pairs (till i are i) - goodp
            int gp = map.getOrDefault(diff, 0);
            bp += i - gp;
            map.put(diff, gp+1);
        }
        
        return bp;
    }
}