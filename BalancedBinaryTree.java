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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return isBalancedHelper(root, 1) >= 0;
    }
    public int isBalancedHelper(TreeNode root, int height) {
        if (root == null) return height;
        int leftDepth = isBalancedHelper(root.left, height+1);
        int rightDepth = isBalancedHelper(root.right, height+1);
        if (leftDepth < 0 || rightDepth < 0 || Math.abs(leftDepth-rightDepth) > 1) return -1;
        return Math.max(leftDepth, rightDepth);
    }
}