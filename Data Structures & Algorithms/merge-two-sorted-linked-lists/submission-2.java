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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode dummy = new ListNode(-1);
        ListNode newNode = dummy;
        while(first!=null && second!=null){
            if(first.val<=second.val){
                newNode.next = first;
                first = first.next;
            } else {
                newNode.next = second;
                second = second.next;
            }
            newNode = newNode.next;
        }
        while(first!=null){
            newNode.next = first;
            first = first.next;
            newNode = newNode.next;
        }
        while(second!=null){
            newNode.next = second;
            second = second.next;
            newNode = newNode.next;
        }
        return dummy.next;
    }
}