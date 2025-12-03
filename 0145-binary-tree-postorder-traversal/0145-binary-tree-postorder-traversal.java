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
    ArrayList<Integer> arr = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        pot(root);
        return arr;
    }
    void pot(TreeNode curr){
        if(curr == null) return;
        pot(curr.left);
        pot(curr.right);
        arr.add(curr.val);

    }
}