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
    int sum = 0;

    // int total=0;
    public void suuum(TreeNode root, int total) {
        if(root==null) return;
        int val = root.val;
        total = total * 10 + val;
        if (root.left == null && root.right == null) {
            sum += total;
            return;
        }

        suuum(root.left, total);
        suuum(root.right, total);

    }

    public int sumNumbers(TreeNode root) {
        suuum(root, 0);
        return sum;
    }
}