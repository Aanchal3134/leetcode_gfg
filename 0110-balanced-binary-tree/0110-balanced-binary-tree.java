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
    //MY SOLUTION
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }

        
        height(root);
        return flag;
        
    }

    public int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        int a = Math.abs(left - right);

        if(a > 1) {
            flag = false;
        }

        return Math.max(left, right) + 1;
    }
}