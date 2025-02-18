class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                idx = i;
                break;
            }
        }

        if(idx == -1) {
            rev(nums, 0, n-1);
            return;
        }

        for(int i=n-1; i>=idx; i--) {
            if(nums[i] > nums[idx]) {
                //swap
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        rev(nums, idx+1, n-1);
    }

    public void rev(int[] arr, int s, int e) {
        int size = e-s+1;

        int left = s, right = e;

        while(left < right) {
            //swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}