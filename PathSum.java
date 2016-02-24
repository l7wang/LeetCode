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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        else if (sum-root.val == 0 && root.left == null & root.right == null) return true;
        
        boolean left = false, right = false;
        left = hasPathSum(root.left, sum-root.val);
        right = hasPathSum(root.right, sum-root.val);
        
        return (left || right);
    }
}