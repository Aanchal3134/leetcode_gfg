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
class Solution { //DFS
    int height = 0;
    public int minDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);
        

        if(left != 0 && right != 0) {
            height = Math.min(left, right) + 1;
        } else {
            height = Math.max(left, right) + 1;
        }

        return height;
        //for max depth we take maximum value - but here we consider min value
    }
}