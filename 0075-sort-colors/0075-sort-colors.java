class Solution {
    public void sortColors(int[] nums) {
        //USING HASHMAPS
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(0, 0);
        count.put(1, 0);
        count.put(2, 0);

        for(int num : nums) {
            count.put(num, count.get(num)+1);
        }

        int idx = 0;
        for(int k=0; k<3; k++) {
            int freq = count.get(k);
            for(int j=0; j<freq; j++) {
                nums[idx] = k;
                idx++;
            }
        }
        
    }
}