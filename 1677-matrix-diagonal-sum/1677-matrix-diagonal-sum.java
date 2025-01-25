class Solution {
    public int diagonalSum(int[][] mat) { //MY SOLUTION - YAY YAY !!
        //given nxn matrix
        int n = mat.length; //n - row == col

        boolean[][] flag = new boolean[n][n];
        int sum = 0;

//to track cols 
        int left = 0;
        int right = n-1;

        
            for(int i=0; i<n; i++) { //row
            
                if(left <= n-1) {
                    if(!flag[i][left]){
                        sum += mat[i][left];
                        flag[i][left] = true;
                        left++;
                    } 
                }

                if(right >= 0) {
                    if(!flag[i][right]) {
                        sum += mat[i][right];
                        flag[i][right] = true;
                        right--;
                    } else {
                        right--;
                    }

                }
            }
        

        return sum;
    }
}