class Solution {
    public int numIdenticalPairs(int[] nums) {
        //SOLUTION SECTION
        int ans = 0;
        int[] count = new int[101];
        for(int i:nums)
        {
            ans+=count[i];
            count[i]++;
        }
        return ans;
    }
}