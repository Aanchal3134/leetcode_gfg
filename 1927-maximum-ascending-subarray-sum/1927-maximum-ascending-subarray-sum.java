class Solution {
    public int maxAscendingSum(int[] nums) {
        //optimised - TC : O(N) - EDITORIAL SECTION
        int maxSum = nums[0];
        int currSum = nums[0];;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                currSum += nums[i];
            } else {
                currSum = nums[i]; //reset curr sum to curr elem
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}