class Solution {
    public int removeElement(int[] nums, int val) { //my approach - took help to copy arraylist to array from gpt
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) list.add(nums[i]);
        }

        for(int i=0; i<list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}