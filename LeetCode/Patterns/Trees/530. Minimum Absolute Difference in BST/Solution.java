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
    int max=0;
    int diff=Integer.MAX_VALUE;
    public void help(TreeNode root){
        if(root==null){
            return;
        }
        diff=Math.min(diff, Math.abs(max-root.val));
        max=root.val;
        help(root.left);
        help(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
        help(root);
        return diff;
    }
}