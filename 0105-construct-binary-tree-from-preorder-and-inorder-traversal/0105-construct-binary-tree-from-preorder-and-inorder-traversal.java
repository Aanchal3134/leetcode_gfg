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
class Solution { //METHOD - 2 >> USE HASHMAPS
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();


        //store indices for each elem of inorder array
        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }

        int[] index = {0};

        return helper(preorder, inorder, 0, preorder.length-1, map, index);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map, int[] index) {
        if(left > right) {
            return null;
        }

        //left and right are two pointers indicating the inorder array passed forward as left or right of a node
         
        int current = preorder[index[0]]; //value of current node
        index[0]++;

        TreeNode node = new TreeNode(current);

        if(left == right) return node;

        int idxInorder = map.get(current);

        node.left = helper(preorder, inorder, left, idxInorder-1, map, index);
        node.right = helper(preorder, inorder, idxInorder+1, right, map, index);

        return node;
    }
}