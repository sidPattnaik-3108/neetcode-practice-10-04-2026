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

/*

    1->2->3->4->null

    1->null;
    2

*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;

        }
        return previous;
    }
}
