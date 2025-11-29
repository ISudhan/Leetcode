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
        if(head == null || head.next == null) return head;
        ListNode prev = null,curr = head,next = null,temp = null;
        while(curr != null && curr.next != null){
            temp = curr.next;
            next = temp.next;
            temp.next = curr;
            curr.next = next;
            if(prev != null) {
                prev.next = temp;
                prev = prev.next.next;
            }
            else{
                head = temp;
                prev = head.next;
            }
            curr = curr.next;
        }
        return head;
    }
}