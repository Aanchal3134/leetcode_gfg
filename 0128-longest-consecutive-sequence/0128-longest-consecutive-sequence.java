class Solution {
    public int longestConsecutive(int[] nums) {
        //VIDEO SOLUTION - BTTER SOLUTION - 
        //1>> SORT
        //2>> CHECK EACH ELEM BY TAKING LAST SMALLEST
        
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int currlen = 0;
        int lastSmallest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(nums[i] - 1 == lastSmallest) {
                currlen++;
                lastSmallest = nums[i];
            } else if(nums[i] != lastSmallest) {
                currlen = 1;
                lastSmallest = nums[i];
            }
            max = Math.max(max, currlen);
        }
        return max;
    }
}

