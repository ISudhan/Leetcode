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
    int a = 0;
    int depth(TreeNode curr){
        if(curr == null) return 0;
        if(curr.left == null && curr.right == null) return 1;
        int l = depth(curr.left);
        int r = depth(curr.right);
        a = Math.max(a,l+r);
        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int f= depth(root);
        return a;
    }
}