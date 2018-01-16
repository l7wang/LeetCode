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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> rights = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        TreeNode temp = root;
        while (temp != null || !rights.empty()) {
            if (temp != null) {
                res.add(temp.val);
                rights.push(temp.right);
                temp = temp.left;
            }
            else {
                temp = rights.pop();
            }
        }
        return res;
    }
}