/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode ans = null,head = null;
    void inorder(TreeNode curr){
        if(curr == null) return;
        inorder(curr.left);
        TreeNode a = new TreeNode();
        a.val = curr.val;
        if(head == null) head = ans = a ;
        else ans = ans.right = a;
        inorder(curr.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head;
    }
}