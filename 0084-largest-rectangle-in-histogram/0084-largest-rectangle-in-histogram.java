class Solution { //BRUTE FORCE
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int maxArea = 0;

        left[0] = -1;
        right[n-1] = n;

        //left bound
        for(int i=1; i<n; i++) {
            int prev = i-1;
            while(prev >= 0 && heights[prev] >= heights[i]) {
                prev = left[prev];
            }
            left[i] = prev;
        }

        //right boundary
        for(int i=n-2; i>=0; i--) {
            int after = i+1;
            while(after < n && heights[after] >= heights[i]) {
                after = right[after];
            }
            right[i] = after;
        }

        //find area
        for(int i=0; i<n; i++) {
            int width = right[i] - left[i] - 1;
            int height = heights[i];
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}