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
class Solution { //help from gpt - used my solution from some other ques approach
//BST - INORDER TRAVERSAL - ASCEND ORDER ARRAY
    List<Integer> list = new ArrayList<>();
    List<Integer> ans = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return findfreq(arr);
    }

    public void inorder(TreeNode node) {
        if(node.left == null && node.right == null) { //leaf node
            list.add(node.val);
            return;
        }
        
        if(node.left != null) inorder(node.left);
        
        list.add(node.val);
        
        if(node.right != null) inorder(node.right);
    }

    public int[] findfreq(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        int maxCount = 1; // Track the maximum count
        int currentCount = 1; // Count occurrences of the current element
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    result.clear();
                    result.add(arr[i - 1]);
                } else if (currentCount == maxCount) {
                    result.add(arr[i - 1]);
                }
                currentCount = 1; // Reset count for the next element
            }
        }

        // Check the last element
        if (currentCount > maxCount) {
            result.clear();
            result.add(arr[n - 1]);
        } else if (currentCount == maxCount) {
            result.add(arr[n - 1]);
        }

        int[] ans = result.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}