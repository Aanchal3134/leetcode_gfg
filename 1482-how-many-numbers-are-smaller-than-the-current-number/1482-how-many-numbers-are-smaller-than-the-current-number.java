class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //do dry run the optimised method to understand
        int n = nums.length;
        int[] result = new int[n];
        int[] count = new int[101];
        //update values in count array
        for(int i=0; i<n; i++) {//till n as we go to nums[i]
            count[nums[i]]++;
        }

        for(int i=1; i<101; i++) {
            count[i] += count[i-1];
        }

        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i]-1];
            }
        }

        return result;
    }
}