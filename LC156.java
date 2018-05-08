/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || root.left == null) {
            return root;
        }
        else {
            TreeNode res = upsideDownBinaryTree(root.left);
            TreeNode center = root.left;
            center.left = root.right;
            center.right = root;
            root.left = null;
            root.right  = null;
            return res;
        }
        
    }
}
