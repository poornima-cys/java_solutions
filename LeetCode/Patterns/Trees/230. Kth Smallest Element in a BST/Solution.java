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
    int ans=-1;
     int c=0;
    public void find(TreeNode root, int k){
        if(root==null) return ;
        find(root.left, k);
        //System.out.println(root.val);
        c+=1;
        if(c==k){
            ans= root.val;
            return ;
        }
         
       find(root.right, k);
       // return ans;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }
        find(root, k);
        return ans;
    }
}