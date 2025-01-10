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
class Solution { //MY solution
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        } 
         
        helper(root);
        return list;
    }

    public void helper(TreeNode node) {
        list.add(node.val);
        if(node.left == null && node.right == null) {
            return;
        }

        if(node.left != null) {
            helper(node.left);
        }
        
        if(node.right != null) {
            helper(node.right);
        }
    }
}