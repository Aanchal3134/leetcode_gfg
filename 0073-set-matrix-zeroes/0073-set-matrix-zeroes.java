class Solution {
    public void setZeroes(int[][] matrix) {
        //optimal approach - VIDEO SOL - no extra space used
        //instead of extra arrays we mark inside the matrix itself
        int m = matrix.length; //row
        int n = matrix[0].length; //col

        int col0 = 1;

        // int[] row = new int[m]; - col[0] - matrix[..][0]
        // int[] col = new int[n]; - row[0]- matrix[0][..]
        
        //mark
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    //mark ith row
                    matrix[i][0] = 0;

                    //mark jth col
                    if(j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        //traverse the array leaving the marked cols
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        //if first elem 0 - entire row 0
        if(matrix[0][0] == 0) {
            for(int i=0; i<n; i++) matrix[0][i] = 0;
        }

        if(col0 == 0) {
            for(int j=0; j<m; j++) matrix[j][0] = 0;
        }
        
    }
}