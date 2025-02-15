class Solution {
    public void sortColors(int[] nums) {
        //dutch flag algo - 3 pointers !!
        int white = 0;
        int red = 0;
        int blue = nums.length-1;

        while(white <= blue) {
            if(nums[white] == 0) {
                //swap with red
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;
                white++;
            } else if(nums[white] == 1) {
                white++;
            } else {
                //nums[white] == 2-> swap with blue
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}