class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length; //n*n matrix so row, col same
        
//REVERSED - using swap and iverse using XOR- FROM SOLUTION SECTION
        for(int i=0; i<n; i++) {
            for(int j=0; j<n/2; j++) { //swapping so only go till half of the cols
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][n-1-j] ^ 1;
                image[i][n-1-j] = temp;
            }

            //for odd length  -- FOR MIDDLE ELEM in the odd length array
            if(n%2 != 0) {
                image[i][n/2] = image[i][n/2] ^ 1;
            }
        }

        
        return image;
    }
}