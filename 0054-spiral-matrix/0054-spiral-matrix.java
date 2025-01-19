class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = matrix.length-1; //row
        int left = 0, right = matrix[0].length-1; //col

        while(left <= right && top <= bottom) {
            //top row
            for(int i=left; i<=right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            //right row
            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(bottom >= top) {
                for(int i=right; i>=left; i--) {
                list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            

            //left row
            if(right >= left) {
                for(int i=bottom; i>=top; i--) {
                list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}







