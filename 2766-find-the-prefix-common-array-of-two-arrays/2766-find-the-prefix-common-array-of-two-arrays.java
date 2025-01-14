class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int[] freq = new int[n+1];
        int common = 0;

        for(int i=0; i<n; i++) {
            //update freq for elem in A
            freq[A[i]]++;
            if(freq[A[i]] == 2) common++;

            //update freq for elem in B
            freq[B[i]]++;
            if(freq[B[i]] == 2) common++;

            C[i] = common;
        }
        return C;
    }
}