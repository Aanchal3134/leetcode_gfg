class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        //SOLUTIONS SECTION
        long costRaw = 0;
        long cost = k;
        long n = arr.length;
        if(arr == brr) return cost;

        for(int i=0; i<n; i++) {
            costRaw += Math.abs((long)arr[i]-brr[i]);
        }

        int[] temp1 = arr.clone();
        int[] temp2 = brr.clone();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        for(int i=0; i<n; i++) {
            cost += Math.abs((long)temp1[i]-temp2[i]);
        }

        return Math.min(cost, costRaw);       
    }
}