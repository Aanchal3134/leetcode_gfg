class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];

        int row = 0;
        int col = n-1;
        

        while(row < n && col >= 0) {
            int i=0; //no need for j
            while(i < n) {
                arr[i][col] = matrix[row][i];
                i++;
            }

            row++;
            col--;
        }

        for(int k=0; k<n; k++) {
            for(int m=0; m<n; m++) {
                matrix[k][m] = arr[k][m];
            }
        }
    }
}