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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root == null) return list;

        helper(root, "", list);
        return list;
    }

    public void helper(TreeNode node, String path, List<String> list) {
        if(node.left == null && node.right == null) {//leaf node
            list.add(path + node.val);
            return;
        }

        if(node.left != null) {
            helper(node.left, path + node.val + "->", list);
        }

        if(node.right != null) {
            helper(node.right, path + node.val + "->", list);
        }
    }
}