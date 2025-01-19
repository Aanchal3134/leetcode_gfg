class Solution {
    public int[][] generateMatrix(int n) {
        int i = 1;
        int[][] arr = new int[n][n];
        int top = 0, bottom = n-1;
        int left = 0, right = n-1;
        while(i <= Math.pow(n, 2) && bottom >= top && right >= left) {
            //top
            for(int j=left; j<=right; j++) {
                arr[top][j] = i;
                i++;
            }
            top++;

            //right
            for(int j=top; j<=bottom; j++) {
                arr[j][right] = i;
                i++;
            }
            right--;

            //bottom
            for(int j=right; j>=left; j--) {
                arr[bottom][j] = i;
                i++;
            }
            bottom--;

            //left
            for(int j=bottom; j>=top; j--) {
                arr[j][left] = i;
                i++;
            }
            left++;
        }
        return arr;
    }
}