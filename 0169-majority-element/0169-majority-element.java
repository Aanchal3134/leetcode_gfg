class Solution {
    public int majorityElement(int[] nums) { //solution sec
        int n = nums.length;

        Arrays.sort(nums);
        return nums[n/2];
    }
}