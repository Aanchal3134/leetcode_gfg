class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //earlier solution was mine - this arraylist solution i saw from solut section
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            list.add(index[i], nums[i]); //pushes rest of elements ahead
        }
        for(int i=0; i<list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}