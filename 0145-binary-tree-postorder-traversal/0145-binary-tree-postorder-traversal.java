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
class Solution { //left , right , node  - method 2 - return a list in every recursive call
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }

        return helper(root, list);
    }

    public List<Integer> helper(TreeNode node, List<Integer> list) {
        if(node.left == null && node.right == null) {
            list.add(node.val);
            return list;
        }

        if(node.left != null) {
            helper(node.left, list);
        }

        if(node.right != null) {
            helper(node.right, list);
        }

        list.add(node.val);
        return list;
    }
}