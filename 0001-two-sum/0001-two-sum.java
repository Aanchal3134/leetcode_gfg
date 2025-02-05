class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimised - hashmap - one pass
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int a = target - nums[i];
            if(map.containsKey(a)) {
                return new int[] {i, map.get(a)};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}