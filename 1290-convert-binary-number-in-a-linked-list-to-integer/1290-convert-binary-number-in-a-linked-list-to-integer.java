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
    public int getDecimalValue(ListNode head) {
        head = reverse(head);
        ListNode curr = head;
        int i = 0,ans = 0;
        while(curr != null){
            ans += curr.val*(int) Math.pow(2,i);
            i++;
            curr = curr.next;
        }
        return ans;
    }
    ListNode reverse(ListNode head){
        ListNode curr = head,prev = null,next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}