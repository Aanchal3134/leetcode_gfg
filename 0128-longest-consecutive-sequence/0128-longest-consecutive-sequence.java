class Solution {
    public int longestConsecutive(int[] nums) {
        //VIDEO SOLUTION - optimal sOLUTION - 
        //using hashset
        //store all elem in hashset
        //search if elem-1 exists
        //it it does then do not iterate
        //if it doesn't iterate for the longest sequence
        int n = nums.length;
        if(n == 0) return 0;
       
        int max = 1;
        int currlen = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(nums[i]);
        }

        for(int num : set) {
            if(!set.contains(num-1)) {
                currlen = 1;
                int x = num;
                while(set.contains(x+1)) {
                    x++;
                    currlen++;
                }
                max = Math.max(currlen, max);
            }
        }
        return max;
    }
}

