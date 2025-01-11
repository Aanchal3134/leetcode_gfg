/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution { //chat gpt help - to convert list to array - remember function
    List<Integer> list = new ArrayList<>();
    //global min
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {        
        if(root == null) {
            return min;
        }

        inorder(root);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        helper(arr);
        return min;
    }

    public void inorder(TreeNode node) {
        if(node.left == null && node.right == null) { //leaf node
            list.add(node.val);
            return;
        }
        
        if(node.left != null) inorder(node.left);
        
        list.add(node.val);
        
        if(node.right != null) inorder(node.right);
    }

    public void helper(int[] arr) {
        int n = arr.length;

        int minimum = 0;
        for(int i=0; i<n-1; i++) {
            //CHECK FOR ADJACENT VALUES
            minimum = arr[i+1] - arr[i];
            min = Math.min(min, minimum);
            
        }
    }
}