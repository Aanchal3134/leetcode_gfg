class Solution {
    public List<List<Integer>> generate(int numRows) {
        //optimal - O(N^2) TC
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows <= 0) return ans;

        for(int row=1; row<=numRows; row++) {
           ans.add(generateRow(row));
        }
        return ans;
    }

    public List<Integer> generateRow(int row) {
        List<Integer> temp = new ArrayList<>();

        long res = 1; //1st term
        temp.add(1);

        for(int col=1; col<row; col++) {
            res = res*(row-col);
            res = res/col;
            temp.add((int)res);
        }
        return temp;
    }
    
}