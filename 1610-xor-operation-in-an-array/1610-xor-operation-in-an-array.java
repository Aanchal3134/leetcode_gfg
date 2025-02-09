class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
    
        for(int i=0; i<n; i++) {
            arr[i] = start + (2 * i);
        }

        if(n == 1) {
            return arr[0];
        }

        int ans = arr[0] ^ arr[1];

        for(int i=2; i<n; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }
}