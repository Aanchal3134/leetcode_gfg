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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // TreeMap sorts by column automatically
        TreeMap<Integer, List<Tuple>> nodes = new TreeMap<>();

        // Queue for BFS traversal
        Queue<Tuple> queue = new LinkedList<>();
        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple temp = queue.poll();
            TreeNode node = temp.node;
            int row = temp.row;
            int col = temp.col;

            // Store nodes at the corresponding column
            nodes.putIfAbsent(col, new ArrayList<>());
            nodes.get(col).add(temp);

            if (node.left != null) {
                queue.offer(new Tuple(node.left, row + 1, col - 1));
            }
            if (node.right != null) {
                queue.offer(new Tuple(node.right, row + 1, col + 1));
            }
        }

        // Processing sorted results
        for (List<Tuple> list : nodes.values()) {
            // Sort first by row, then by value
            list.sort((a, b) -> a.row == b.row ? Integer.compare(a.node.val, b.node.val) : Integer.compare(a.row, b.row));

            List<Integer> sortedCol = new ArrayList<>();
            for (Tuple t : list) {
                sortedCol.add(t.node.val);
            }
            ans.add(sortedCol);
        }

        return ans;
    }

    // Helper class to store TreeNode with row and column info
    static class Tuple {
        TreeNode node;
        int row, col;

        public Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
}