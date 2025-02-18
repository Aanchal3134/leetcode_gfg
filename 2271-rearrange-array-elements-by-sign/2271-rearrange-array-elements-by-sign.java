class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        //even indx - even no, odd idx - odd no

        int even = 0;
        int odd = 1;
        for(int num : nums) {
            if(num > 0) {
                if(even < n) arr[even] = num;
                even += 2;
            } else {
                if(odd < n) arr[odd] = num;
                odd += 2;
            }
        }
        return arr;
    }
}