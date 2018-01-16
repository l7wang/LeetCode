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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        TreeNode temp = invertTree(root);
        return compareTrees(temp, root);
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode newTree = new TreeNode(root.val);
        newTree.left = invertTree(root.right);
        newTree.right = invertTree(root.left);
        return newTree;
    }
    public boolean compareTrees(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) return true;
        else if (tree1 != null && tree2 != null && tree1.val == tree2.val) {
            return compareTrees(tree1.left, tree2.left) && compareTrees(tree1.right, tree2.right);    
        }
        return false;
    }
}