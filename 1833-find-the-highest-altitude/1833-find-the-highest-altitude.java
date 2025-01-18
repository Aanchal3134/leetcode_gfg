class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        //altitudes - hint 1 > refer
        int alt[] = new int[n+1];

        alt[0] = 0;
        int sum = 0;
        int max = 0;
        for(int i=1; i<n+1; i++) {
            sum += gain[i-1];
            max = Math.max(max, sum);
        }

        return max;
    }
}