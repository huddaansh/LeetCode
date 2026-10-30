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
    public ListNode swapPairs(ListNode head) {
        if ( head == null ||  head.next == null ) 
            return head ;
        ListNode newHead = new ListNode(-1,head);

        ListNode dummy = newHead;
        while (dummy.next != null && dummy.next.next != null) {

            ListNode first = dummy.next;
            ListNode second = first.next;

            // Swap nodes
            first.next = second.next;
            second.next = first;
            dummy.next = second;

            // Move to the next pair
            dummy = first;
        }
        return newHead.next;
        
    }
}