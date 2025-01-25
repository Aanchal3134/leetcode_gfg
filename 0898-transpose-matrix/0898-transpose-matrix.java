class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //original mat = mat[m][n] so transpose matrix - arr[n][m]

        int[][] arr = new int[n][m];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}