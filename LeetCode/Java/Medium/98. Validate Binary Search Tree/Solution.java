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
    public boolean call(TreeNode root){
    if(root.left==null || root.right==null){
        return true;
    }
    call(root.left);
    call(root.right);
    if(root.left.val<=root.val && root.right.val>root.val){
        return true;
    }
    return false;
    }
    
    public boolean isValidBST(TreeNode root) {
     return call(root);   
    }
}