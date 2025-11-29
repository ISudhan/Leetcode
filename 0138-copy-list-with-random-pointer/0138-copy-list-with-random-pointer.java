/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node curr = head,newHead = null,newTail = null,curr2;
        for(;curr != null;curr = curr.next){
            Node newNode = new Node(curr.val);
            map.put(curr,newNode);
            if(newHead == null) newHead = newTail = newNode;
            else newTail = newTail.next = newNode;
        }
        for(curr = head,curr2 = newHead;curr != null;curr = curr.next,curr2 = curr2.next){
            curr2.random = map.get(curr.random);
        }
        return newHead;
    }
}