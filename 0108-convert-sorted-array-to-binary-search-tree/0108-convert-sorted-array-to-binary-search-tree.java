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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeBST(nums, 0, nums.length-1);

    }

    public TreeNode makeBST(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }

        int mid = (start+end)/2; //index of mid value
        TreeNode node = new TreeNode(arr[mid]); //node is curr node or root node

        node.left = makeBST(arr, start, mid-1);
        node.right = makeBST(arr, mid+1, end);

        return node;
    }
}