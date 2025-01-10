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
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        } 
         
        helper(root, list);
        return list;
    }

    public List<Integer> helper(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if(node.left == null && node.right == null) {
            return list;
        }

        if(node.left != null) {
            helper(node.left, list);
        }
        
        if(node.right != null) {
            helper(node.right, list);
        }
        return list;
    }
}