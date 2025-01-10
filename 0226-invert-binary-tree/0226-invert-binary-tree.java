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
class Solution { //MY SOLUTION
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }

        helper(root);
        return root;
    }

    public void helper(TreeNode node) {
        //leaf node
        if(node.left == null && node.right == null) {
            return;
        }
        
        TreeNode temp = new TreeNode();

        
        temp = node.left;
        node.left = node.right;
        node.right = temp;

        if(node.left != null) {helper(node.left);}
        
        
        if(node.right != null) {helper(node.right);  }
             
        
             
    }
}