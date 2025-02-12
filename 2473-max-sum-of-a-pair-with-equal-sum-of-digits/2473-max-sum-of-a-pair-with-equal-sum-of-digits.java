class Solution { //editorial section - TC : O(N LOGN)
    public int maximumSum(int[] nums) {
        int size = nums.length;
        Pair<Integer, Integer>[] digSumPair = new Pair[size];

        for(int i=0; i<size; i++) {
            int digSum = digitSum(nums[i]);
            digSumPair[i] = new Pair<>(digSum, nums[i]);
        }

        Arrays.sort(digSumPair, Comparator.comparing(Pair<Integer, Integer>::getKey).thenComparing(Pair<Integer, Integer>::getValue));

        int max = -1;

        for(int i=1; i<digSumPair.length; i++) {
            int currDigSum = digSumPair[i].getKey();
            int prevDigSum = digSumPair[i-1].getKey();

            if(currDigSum == prevDigSum) {
                int currSum = digSumPair[i].getValue() + digSumPair[i-1].getValue();
                max = Math.max(max, currSum);
            }
        }

        return max;
    }

    private int digitSum(int n) {
         int sum = 0;
            while(n > 0) {
                int ld = n%10;
                sum += ld;
                n /= 10;
            }
        return sum;
    }
}


