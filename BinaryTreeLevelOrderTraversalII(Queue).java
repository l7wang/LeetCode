/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if (root == null) return res;
        queue.offer(root);
        
        while (!(queue.size() == 0)) {
            List<Integer> temp = new ArrayList<Integer>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (queue.peek().left != null)  queue.offer(queue.peek().left);
                if (queue.peek().right != null)  queue.offer(queue.peek().right);
                temp.add(queue.poll().val);
            }
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}