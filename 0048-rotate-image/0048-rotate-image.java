class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] arr = new int[n][n];

        int row = 0;
        int col = n-1;
        

        while(row < n && col >= 0) {
            int i=0; 
            int j=0;
            while(i < n && j < n) {
                arr[j][col] = matrix[row][i];
                j++;
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