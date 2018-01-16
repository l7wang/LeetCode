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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if (root == null) return res;
        String cur = Integer.toString(root.val);
        if (root.left == null && root.right == null) res.add(cur);
        if (root.left != null) binaryTreePathsHelper(res, cur, root.left);
        if (root.right != null) binaryTreePathsHelper(res, cur, root.right);
        return res;
        
    }
    public void binaryTreePathsHelper(List<String> res, String cur, TreeNode root) {
        String temp = cur;
        cur = cur + "->" + Integer.toString(root.val);
        if (root.left == null && root.right == null) res.add(cur);
        if (root.left != null) binaryTreePathsHelper(res, cur, root.left);
        if (root.right != null) binaryTreePathsHelper(res, cur, root.right);
        cur = temp;
    }
}