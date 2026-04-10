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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode leftPtr = dummy;
        ListNode rightPtr = head;
        while(n>0){
            rightPtr = rightPtr.next;
            n--;
        } 
        //move right ptr till it hits null
        while(rightPtr!=null){
            rightPtr = rightPtr.next;
            leftPtr = leftPtr.next;
        }
        leftPtr.next = leftPtr.next.next;

        return dummy.next;
    }
}
