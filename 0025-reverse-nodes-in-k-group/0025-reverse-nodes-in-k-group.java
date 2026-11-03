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

    private ListNode reverse(ListNode head, ListNode prev){
        ListNode current = head ;
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {


        if(k == 1) return head;

        ListNode dummy = new ListNode (-1, head);
        ListNode p = dummy , q = head;
        while(q != null){
            ListNode firstNode =q;
            int val = k;
            while(val > 1 && q != null){
                q = q.next;
                val -= 1;

            }
            if ( q != null){
                ListNode nextGroup = q.next;
                q.next = null;
                p.next = reverse(firstNode ,nextGroup);

                p = firstNode;
                q = nextGroup;
            }


        }
        return dummy.next;
    }
}