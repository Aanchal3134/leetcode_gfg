class Solution {
    public int maxAscendingSum(int[] nums) {
        //BRUTE FORCE - EDITORIAL SECTION
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<nums.length; i++) {
            currSum = nums[i];
            for(int j=i+1; j<nums.length && nums[j] > nums[j-1]; j++) {
                currSum += nums[j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}