class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //add the nums at the end. then reverse the list to get ans
        List<Integer> list = new ArrayList<>();

        int n = num.length;
        int i = n-1;
        while(i >= 0 || k > 0) {
            if(i >= 0) {
                k += num[i];
            }
            list.add(k%10);
            k /= 10;
            i--;
        }

        Collections.reverse(list);
        return list;
    }
}