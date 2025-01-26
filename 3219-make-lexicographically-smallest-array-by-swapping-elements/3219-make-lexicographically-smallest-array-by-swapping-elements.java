class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        //NEETCODE VIDEO SOLUTION - PYTHON - GPT CONVERTED IT TO JAVA
        //list of deque to store grps of elem
        List<Deque<Integer>> groups = new ArrayList<>();

        Map<Integer, Integer> newMaptoIdx = new HashMap<>();

        int[] temp = nums.clone();;
        Arrays.sort(temp);

        int[] res = new int[nums.length]; 

        for(int n : temp) {
            if(groups.isEmpty() || Math.abs(n-groups.get(groups.size()-1).peekLast()) > limit) {
                groups.add(new ArrayDeque<>());
            }

            groups.get(groups.size()-1).addLast(n);

            newMaptoIdx.put(n, groups.size()-1);
        }

        for(int i=0; i<nums.length; i++) {
            int grpIdx = newMaptoIdx.get(nums[i]);
            res[i] = groups.get(grpIdx).pollFirst(); //first cuz we want smallest elem first
        }
        return res;
    }
}