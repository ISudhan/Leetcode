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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head,prev = null;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int a = 0,b = 0;
            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }
            int val = a+b+carry;
            curr.val = val % 10;
            ListNode newNode = new ListNode();
            curr.next = newNode;
            prev = curr;
            curr = curr.next;
            if(val > 9) carry = 1;
            else carry = 0;
        }
        prev.next = null;
        return head;
    }
}