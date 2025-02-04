class Solution {
    public int maxSubArray(int[] nums) {
        //solution section 

        int currSum = 0;
        int maxSum = nums[0];

        for(int n : nums) {
            if(currSum < 0) currSum = 0;
            currSum += n;
            maxSum = Math.max(maxSum, currSum);
        }

        

        return maxSum;
    }
}