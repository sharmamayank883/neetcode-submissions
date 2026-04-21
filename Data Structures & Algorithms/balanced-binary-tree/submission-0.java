/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        // Base case: an empty tree is balanced
        if (root == null) return true;

        // Calculate height of left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Check if current node is balanced AND recurse for children
        return Math.abs(leftHeight - rightHeight) <= 1 
           && isBalanced(root.left) 
           && isBalanced(root.right);
    }

    // You still need a way to get height
    private int getHeight(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
