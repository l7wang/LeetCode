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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root != null) pathSumHelper(res, new ArrayList<Integer>(), root, sum);
        return res;
    }
    
    public void pathSumHelper(List<List<Integer>> res, List<Integer> temp, TreeNode root, int sum) {
        temp.add(root.val);
        if (root.left == null && root.right == null && sum-root.val == 0) {
            res.add(new ArrayList<Integer>(temp));
        }
        if (root.left != null) pathSumHelper(res, temp, root.left, sum-root.val);
        if (root.right != null) pathSumHelper(res, temp, root.right, sum-root.val);
        temp.remove(temp.size()-1);
    }
}