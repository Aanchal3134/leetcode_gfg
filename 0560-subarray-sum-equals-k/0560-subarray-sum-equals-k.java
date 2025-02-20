class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int preSum = 0;

        map.put(0, 1); //initialise map

        for(int i=0; i<n; i++) {
            preSum += nums[i];

            int remove = preSum - k; //x-k

            count += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }

        return count;
    }
}