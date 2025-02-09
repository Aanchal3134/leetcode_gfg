class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        //(pos, count)
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] > nums[j] && nums[i]-nums[j] == k) count++;
                if(nums[j] > nums[i] && nums[j]-nums[i] == k) count++;
            }
        }
        return count;
    }
}