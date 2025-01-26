class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        //VIDEO SOLUTION
        int[][] ans = new int[m][n];

        int count = 0;
//m - rows, n- cols
        for(int i=0; i<indices.length; i++) { //till no of rows in indices
            for(int j=0; j<n; j++) { //row remains constant , col changes
                ans[indices[i][0]][j]++;
            }
            for(int j=0; j<m; j++) {
                //col remians same , row changes
                ans[j][indices[i][1]]++;
            }
        }

        //COUNT ODD NUMBERS IN ANS
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}