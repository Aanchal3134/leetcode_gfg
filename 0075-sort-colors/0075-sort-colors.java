class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        int n = nums.length;
        for(int i=0; i<n; i++) {
            freq[nums[i]]++;
        }

        int i = 0;
        int k = 0;
        while(i<n && k<3) {
            if(freq[k] > 0) {
                nums[i] = k;
                i++;
                freq[k]--;
            } else {
                k++;
            }  
        }
    }
}