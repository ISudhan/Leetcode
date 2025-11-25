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
        int i = 1;
        ListNode slow = head,fast = head,prev = null;
        for(;i<n;fast=fast.next,i++);
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(prev != null) prev.next = slow.next;
        else head = slow.next;
        return head;

    }
}