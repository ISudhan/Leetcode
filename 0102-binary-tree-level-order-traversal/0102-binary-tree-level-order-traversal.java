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
    List<List<Integer>> l = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    int i = 1;

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return l;
        q.offer(root);
        while (q.size() != 0) {
            List<Integer> dl = new ArrayList<>();
            i = q.size();
            while (i != 0) {
                i--;
                TreeNode s = q.peek();
                dl.add(s.val);
                if (s.left != null)
                    q.offer(s.left);
                if (s.right != null)
                    q.offer(s.right);
                q.poll();
            }
            l.add(dl);
        }
        return l;
    }
}