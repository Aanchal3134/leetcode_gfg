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
class Solution {
    int max = 0; //global diameter
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        helper(root);
        return max-1;
    }

    public int helper(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);
        int diam = left + right + 1; //this is no of nodes
        max = Math.max(max, diam);
        return Math.max(left, right) + 1;
        
    }
}