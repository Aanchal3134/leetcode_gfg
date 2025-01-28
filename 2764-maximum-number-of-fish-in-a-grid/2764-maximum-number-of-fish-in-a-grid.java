class Solution {
    public int findMaxFish(int[][] grid) {
        int m = grid.length; //rows
        int n = grid[0].length; //cols
        int maxSum = 0;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] > 0) {
                    maxSum = Math.max(maxSum, dfs(grid, i, j, m, n));
                } else {
                    continue;
                }
            }
        }

        return maxSum;
    }

    public int dfs(int[][] grid, int i, int j, int m, int n) {
        int sum = 0;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] == 0) return sum;

        sum += grid[i][j];

        grid[i][j] = 0;

        sum += dfs(grid, i, j+1, m, n);
        sum += dfs(grid, i, j-1, m, n);
        sum += dfs(grid, i+1, j, m, n);
        sum += dfs(grid, i-1, j, m, n);

        return sum;
    }
}