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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null,tail = null;
        while(l1 != null || l2 != null){
            ListNode newNode = new ListNode();
            if(l1 != null && l2 != null){
                if(l1.val == l2.val){
                    newNode.val = l1.val;
                    l1 = l1.next;
                }
                else if(l1.val > l2.val){
                    newNode.val = l2.val;
                    l2 = l2.next;
                }
                else{
                    newNode.val = l1.val;
                    l1 = l1.next;
                }
                if(head == null) head = tail = newNode;
            else {
                tail.next = newNode;
                tail = tail.next;
            }
            }
            else{
                while(l1 != null){
                    ListNode n = new ListNode(l1.val);
                    if(head == null){
                        head = n;
                        tail = head;
                    }
                    else{
                    tail.next = n;
                    tail = tail.next;
                    }
                    l1 = l1.next;
                }
                while(l2 != null){
                    ListNode n = new ListNode(l2.val);
                    if(head == null){
                        head = n;
                        tail = head;
                    }
                    else{
                    tail.next = n;
                    tail = tail.next;
                    }
                    l2 = l2.next;
                }
            }

        }
        return head;
    }
}