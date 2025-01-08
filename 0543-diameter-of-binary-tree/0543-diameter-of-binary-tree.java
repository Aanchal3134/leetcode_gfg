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
    int max = 0; //global max
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return max - 1; //max is the max no of nodes so edges = max-1
    }

    public int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        //for recursive problem we return the height and keep diameter updates

        int left = height(node.left);
        int right = height(node.right);
        int height = Math.max(left, right) + 1;

        int diam = left + right + 1;
        max = Math.max(max, diam);

        return height;

    }
}