/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution { //GPT SOLUTION - MY APPROACH 
//BETTER APPROACH WITH LESS TC, SC WOULD BE TO USE BITWISE OPERATOR
    public int getDecimalValue(ListNode head) {
        return getDecimalValueHelper(head, 0);
    }

    private int getDecimalValueHelper(ListNode node, int result) {
        if (node == null) {
            return result;
        }

        // Shift the current result left (multiply by 2) and add the current node value
        return getDecimalValueHelper(node.next, result * 2 + node.val);
    }

}