class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int p1 = 0;
        int p2 = n; //mid value

        for(int i=0; i<(2*n - 1); i=i+2) {
            ans[i] = nums[p1];
            ans[i+1] = nums[p2];
            p1++;
            p2++;
        }
        return ans;
    }
}