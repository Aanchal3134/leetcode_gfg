class Solution { //BRUTE FORCE
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 0) return 0;

        //inc subarrays
        int maxLength = 0; 
        for(int i=0; i<nums.length; i++) {
            int currLength = 1;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] > nums[j-1]) {
                    currLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(currLength, maxLength);
        }

        //dec subarrays
        for(int i=0; i<nums.length; i++) {
            int currLength = 1;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j] < nums[j-1]) {
                    currLength++;
                } else {
                    break;
                }
            }
            maxLength = Math.max(currLength, maxLength);
        }

        return maxLength;
    }
}