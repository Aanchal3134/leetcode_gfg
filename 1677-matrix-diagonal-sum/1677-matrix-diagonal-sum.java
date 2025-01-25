class Solution {
    public int diagonalSum(int[][] mat) {
        //given nxn matrix
        int n = mat.length;

        boolean[][] flag = new boolean[n][n];
        int p1 = mat[0][0], p2 = mat[0][n-1];
        int sum = 0;

//to track cols 
        int left = 0;
        int right = n-1;

        
            for(int i=0; i<n; i++) { //row
            
                if(left <= n-1) {
                    if(flag[i][left] == false){
                        sum += mat[i][left];
                        flag[i][left] = true;
                        left++;
                    } 
                }

                if(right >= 0) {
                    if(flag[i][right] == false) {
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