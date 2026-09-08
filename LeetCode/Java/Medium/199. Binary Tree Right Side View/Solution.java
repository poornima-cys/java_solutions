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
    // ArrayList<Integer> arr= new ArrayList<>();
    // int max=Integer.MIN_VALUE;
    // public void traverse(TreeNode root, int level, int ml, ArrayList<Integer> arr) {
    //     if(root == null) return;
    //      if(level> ml) {
    //         arr.add(root.val);
    //         max = Math.max(max, level);
    //     }
    //     traverse(root.right, level+1, max, arr);
       
    //     traverse(root.left, level+1, max, arr);
    // }
    // public List<Integer> rightSideView(TreeNode root) {
    //     if(root == null) return new ArrayList();
    //     int maxlevel = Integer.MIN_VALUE;
    //     traverse(root, 0, maxlevel, arr);
    //     return arr;
    // }
    List<Integer> list=new ArrayList<>();
    List<Integer> ans=new ArrayList<>();
    public void check(TreeNode root, int l){
        if(root==null){
            return ;
        }
        if(!list.contains(l)){
            list.add(l);
            ans.add(root.val);
        }
         check(root.right, l+1);
        check(root.left, l+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        check(root,0);
        return ans;
    }
}