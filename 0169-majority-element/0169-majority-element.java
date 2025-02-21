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
        //NO NEED TO CHECK IF MAJORITY ELEM IS el AS QUES SAYS 
        //THE ARRAY ALWAYS HAS A MAJ ELEM
        //SO THE LAST STEP ONLY CHECK IF ARRAY HAS A MAJ ELEM OR NOT WE DON'T KNOW

        return el;
    }
}