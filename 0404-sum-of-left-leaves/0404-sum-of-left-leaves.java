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
 //MY SOLUTION
class Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }

        helper(root);
        return sum;
    }

    public void helper(TreeNode node) {
        if(node.left == null && node.right == null) { //leaf node
            return;
        }
        // if(node.left == null) { //if no left node return 
        //     return sum;
        // }

        if(node.left != null) { //left node
            helper(node.left);
            if(node.left.left == null && node.left.right == null) { //left leaf node
                sum = sum + node.left.val;
            }
        }
        
        if(node.right != null) {
            helper(node.right);
        }   
        return;
    }
}