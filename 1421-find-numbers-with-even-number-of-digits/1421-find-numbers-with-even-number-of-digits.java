class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(findDigits(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int findDigits(int n) {
        int ans = 0;
        while(n > 0) {
            int ld = n%10;
            n=n/10;
            ans++;
        }
        return ans;
    }
}