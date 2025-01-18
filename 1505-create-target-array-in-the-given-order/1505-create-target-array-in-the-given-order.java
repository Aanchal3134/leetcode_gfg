class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n =  nums.length;
        int[] target = new int[n];
        for(int i=0; i<n; i++) {
                shift(target, index[i]);
                target[index[i]] = nums[i];
        }
        return target;
    }

    public int[] shift(int[] arr, int i) {
        //shift array from index i till end
        for(int j=arr.length-2; j>=i; j--) {
            arr[j+1] = arr[j];
        }
        return arr;
    }
}