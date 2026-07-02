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

class Solution {
    public ListNode reverseList(ListNode head) {
        // Create a dummy node to simplify the reversal process
        // The dummy node will point to the reversed list
        ListNode dummyNode = new ListNode();
      
        // Initialize current pointer to traverse the original list
        ListNode current = head;
      
        // Iterate through each node in the original list
        while (current != null) {
            // Store the next node before breaking the link
            ListNode nextNode = current.next;
          
            // Insert current node at the beginning of the reversed list
            // Point current node to whatever dummy is pointing to
            current.next = dummyNode.next;
          
            // Make dummy point to the current node (insert at front)
            dummyNode.next = current;
          
            // Move to the next node in the original list
            current = nextNode;
        }
      
        // Return the head of the reversed list (node after dummy)
        return dummyNode.next;
    }
}
