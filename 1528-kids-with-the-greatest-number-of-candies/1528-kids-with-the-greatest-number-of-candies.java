class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();

        //find the largest elem in array
        int larg = largest(candies);
        for(int i=0; i<candies.length; i++) {
            if(candies[i]+extraCandies >= larg) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public int largest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}