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
    int sum = 0;
    boolean ans = false;
    void ino(TreeNode curr,int t){
        if(curr == null) return;
        sum += curr.val;
        if(curr.left == null && curr.right == null && sum==t) ans = true;
        ino(curr.left,t);
        ino(curr.right,t);
        sum -= curr.val;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        ino(root,targetSum);
        return ans;
    }
}