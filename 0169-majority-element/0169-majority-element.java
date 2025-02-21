class Solution {
    public int majorityElement(int[] nums) {
        //MOOR'S VOTING ALGO 
        //VERY IMP TO UNDERSTAND 
        //NOT TO BE MUGGED UP BUT BUILD THE INTUITION - EITHER REWATCH VIDEO
        //OR IF U REMEMBER THEN DRY RUN THE EXAMPLE
        int n = nums.length;
        int el = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(count == 0) {
                count = 1;
                el = nums[i];
            } else if(nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count2 = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == el) {
                count2++;
            }
        }

        if(count2 > n/2) {
            return el;
        }

        return -1;
    }
}