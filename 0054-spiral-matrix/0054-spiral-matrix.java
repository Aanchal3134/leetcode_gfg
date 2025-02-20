class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int n = matrix.length; //row
        int m = matrix[0].length;

        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while(left <= right && bottom >= top) {
            //right
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //down
            
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            
            
            //left
            if(bottom >= top) {
                for(int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            

            //up
            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return list;
    }
}