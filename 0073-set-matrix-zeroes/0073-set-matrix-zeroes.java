class Solution {
    public void setZeroes(int[][] matrix) {
        //better approach - VIDEO SOL
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];
        
        //make 2 arrays same size as row, col
        //go to each elem and mark those elem in row/col array
        //acc to marked array change the final array

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //update
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        

    }
}