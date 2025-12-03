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
    public int countNodes(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        int c = 0;
        while(curr != null || !st.empty()){
            while(curr != null){
                c++;
                st.push(curr);
                curr = curr.left;
            }
            curr = st.peek();
            st.pop();
            curr = curr.right;
        } 
        return c;
    }
}