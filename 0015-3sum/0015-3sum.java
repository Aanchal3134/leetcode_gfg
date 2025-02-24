class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        //BETTER APPROACH - O(N^2) : TC
        Set<List<Integer>> st = new HashSet<>(); //stores list of int for ans
        for(int i=0; i<n; i++) {
            Set<Integer> tempset = new HashSet<>();
            for(int j=i+1; j<n; j++) {
                int third = -(nums[i] + nums[j]);
                if(tempset.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null); //temp list sorted to be kept uniquely in set
                    st.add(temp); //ans set to be added to ans list
                }
                tempset.add(nums[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st); //set(list) is stored in list of list
        return ans;
    }
}