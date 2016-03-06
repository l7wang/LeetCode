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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        
        TreeNode temp = root;
        while (temp != null || !stack.empty()) {
            if (temp != null) {
                stack.push(temp);                
                temp = temp.left;
            }
            else {
                temp = stack.pop();
                res.add(temp.val);
                temp = temp.right;
            }
        }
        return res;    
    }
}