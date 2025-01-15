class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(max < candies[i]) {
                max = candies[i];
            }
        }//find the largest elem in array
        
        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    
}