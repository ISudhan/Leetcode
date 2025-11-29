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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int count = 1,i;
        ListNode start = head,prev = null,curr = head,temp = null,rev = null;
        while(curr != null){
            for( i = 1;i<count && curr != null;i++,curr = curr.next);
            if(curr == null) i = i-1;
            if(i%2 == 0){
                if(curr != null)
                temp = curr.next;
                else temp = null;
                if(curr != null)
                curr.next = null;
                rev = reverse(start);
                if(prev != null) prev.next = rev;
                else head=rev;
                prev = start;
                start = curr = temp;
            } 
            else{
                if(prev != null) prev.next = start;
                prev = curr;
                if(curr != null) curr = curr.next;
                start = curr;
            }
            count++;
        }
        return head;
    }
    ListNode reverse(ListNode head){
        ListNode curr = head,prev = null,next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}