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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start = null,end = null,prev = null,next = null,curr = head;
        int c = 0;
        Stack<ListNode> st = new Stack<>();
        while(curr != null){
            c++;
            if(c == left-1) prev = curr;
            else if(c == left){
                start = curr;
                st.push(curr);
            }
            else if(left < c && c <= right){
                end = curr;
                st.push(curr);
            }
            else if(c == right+1) next = curr;
            else if(c>right) break;
            curr = curr.next;
        }
        if(!st.empty() && prev == null){
            head = st.pop();
            prev = head;
        } 
        while(!st.empty()){
            prev.next = st.pop();
            prev = prev.next;
        }
        if(next != null) prev.next = next;
        else prev.next = null;
        return head;
    }
}