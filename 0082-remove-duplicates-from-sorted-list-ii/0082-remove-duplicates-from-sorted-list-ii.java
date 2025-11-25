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
        ListNode prev= null,curr = head;
        int c = 0;
        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                curr.next = curr.next.next;
                c++;
            }
            else{
                if(c == 0){
                    prev =curr;
                    curr = curr.next;
                }
                else{
                    if(prev != null ){
                        prev.next = curr.next;
                    }
                    else head = curr.next;
                    curr = curr.next;
                    c=0;

                }
            }
        }
        return head;
    }
}