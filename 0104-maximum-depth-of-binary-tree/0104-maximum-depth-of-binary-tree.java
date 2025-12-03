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
    int depth(TreeNode curr){
        if(curr == null) return 0;
        if(curr.left == null && curr.right == null) return 1;
        return Math.max(depth(curr.right)+1,depth(curr.left)+1);
    }
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
}