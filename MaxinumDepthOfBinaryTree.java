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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return maxDepthHelper(root);
    }
    public int maxDepthHelper(TreeNode root) {
        if (root.left == null && root.right == null) return 1;
        int maxLeft = 0, maxRight = 0;
        if (root.left != null) maxLeft = maxDepthHelper(root.left);
        if (root.right != null) maxRight = maxDepthHelper(root.right);
        return Math.max(maxLeft+1, maxRight+1);
    }
}