class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int target = n/3;
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        //find freq of each elem
        //iterate over hashmap to find if freq of elem is > target - if yes add to list    
        for(int i=0; i<n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > target) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}