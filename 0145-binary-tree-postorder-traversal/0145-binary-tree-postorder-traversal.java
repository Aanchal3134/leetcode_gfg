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
class Solution { //left , right , node
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root == null) {
            return list;
        }

        helper(root);
        return list;
    }

    public void helper(TreeNode node) {
        if(node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }

        if(node.left != null) {
            helper(node.left);
        }

        if(node.right != null) {
            helper(node.right);
        }

        list.add(node.val);
    }
}