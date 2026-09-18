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
    public int helpleft(TreeNode root){
        int c=0;
        while(root!=null){
            c++;
            root=root.left;
        }
        return c;
    }
     public int helpright(TreeNode root){
        int c=0;
        while(root!=null){
            c++;
            root=root.right;
        }
        return c;
    }
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=helpleft(root);
        int right=helpright(root);

        if(left==right){
            return (int)Math.pow(2,left)-1;
        }
        return countNodes(root.left)+ countNodes(root.right) + 1 ;
    }
}