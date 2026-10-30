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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-1,head);
        ListNode dummy = newHead;

        while(dummy.next != null && dummy.next.next != null){
            if(dummy.next.val == dummy.next.next.val){
                int duplicate = dummy.next.next.val;
                while(dummy.next != null && dummy.next.val == duplicate){
                    dummy.next = dummy.next.next;
                }

                
            }else{
                dummy = dummy.next;
            }
        }
        return newHead.next;
        
    }
}