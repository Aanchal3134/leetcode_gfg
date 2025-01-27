class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length; //row
        int m = accounts[0].length; //col

        int sum = 0;
        int max = 0;

        for(int i=0; i<n; i++) {
            sum = 0;
            for(int j=0; j<m; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(sum, max); //check when 1 row sum is calculated
        }
        return max;
    }
}