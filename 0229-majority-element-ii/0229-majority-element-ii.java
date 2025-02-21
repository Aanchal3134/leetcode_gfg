class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //MOOR'S VOTING ALFO - STRIVER'S VIDEO
        int n = nums.length;
        int target = n/3;
        List<Integer> list = new ArrayList<>();

        int count1 = 0, count2 = 0;
        int el1 = 0, el2 = 0;

        for(int i=0; i<n; i++) {
            if(count1 == 0 && nums[i] != el2) {
                el1 = nums[i];
                count1 = 1;
            }else if(count2 == 0 && nums[i] != el1) {
                el2 = nums[i];
                count2 = 1;
            } else if(nums[i] == el1) {
                count1++;
            } else if(nums[i] == el2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        int c1 = 0, c2 = 0;
        for(int i=0; i<n; i++) {
            if(el1 == nums[i]) {
                c1++;
            }
            if(el2 == nums[i]) {
                c2++;
            }
        }
        if(c1 > target) { list.add(el1); } 
        if(c2 > target && el1 != el2) { list.add(el2); }
        return list;
    }
}