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
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //INORDER - LEFT - NODE - RIGHT
        if(root == null) {
            return list;
        }

        helper(root);
        return list;
    }

    public TreeNode helper(TreeNode node) {
        if(node == null) {
            return null;
        }

        if (node.left != null) {
            TreeNode left = helper(node.left);
            
        }
        
        
        list.add(node.val);

        if(node.right != null) {
            TreeNode right = helper(node.right);
            
        }

        
        return node;
    }
}