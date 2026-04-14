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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);
        slow.next = null;
        ListNode first = head;

        while(second!=null){
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }

    private ListNode reverse(ListNode node){
        ListNode current = node;
        ListNode previous = null;
        ListNode newnode = null;

        while(current!=null){
            newnode = current.next;
            current.next = previous;
            previous = current;
            current = newnode;

        }
        return previous;
    }
}
