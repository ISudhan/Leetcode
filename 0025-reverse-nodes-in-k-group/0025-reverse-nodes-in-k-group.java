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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        ListNode start = null,curr = head,end = null,prev = null,next = null;
        int d = 0;
        while(curr != null){
            d++;
            if(d == 1){
                start = curr;
                prev = end;
            }
            else if(d == k){
                d = 0;
                end = curr;
                next = end.next;
                ListNode[] a = reverse(start,end,prev,next);
                start = a[0];
                end = a[1];
                if(prev == null) head = start;
                curr = end;
                prev = end;
            }
            curr = curr.next;
        }
        return head;
    }
    ListNode[] reverse(ListNode start,ListNode end,ListNode prev,ListNode next){
        ListNode curr = start;
        Stack<ListNode> st = new Stack<>();
        while(curr != null){
            st.push(curr);
            if(curr == end) break; 
            curr = curr.next;
        }
        start = st.pop();
        curr = start;
        while(!st.empty()){
            curr.next = st.pop();
            curr = curr.next;
        }
        end = curr;
        end.next = next;
        if(prev != null) prev.next = start;
        ListNode[] a = {start,end};
        return a;
    }
}