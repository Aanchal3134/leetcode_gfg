class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //O(N) - TC - OPTIMIZED - EDITORIAL SECTION
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        int maxLength = 0;
        int incLength = 1;
        int decLength = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                incLength++;
                decLength = 1;
            } else if(nums[i] < nums[i-1]) {
                decLength++;
                incLength = 1;
            } else {
                decLength = 1;
                incLength = 1;
            }
            int max = incLength > decLength ? incLength : decLength;
            maxLength = Math.max(maxLength, max);
        }

        return maxLength;
    }
}