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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int ps=0, is=0;
        int pe=preorder.length-1, ie=inorder.length-1;
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i=0;i<=ie;i++){
            hm.put(inorder[i],i);
        }
       TreeNode root = tree(preorder, ps, pe, inorder, 0, ie, hm);
        return root;
    }
    public TreeNode tree(int[] pre, int ps, int pe, int[] in, int is, int ie, HashMap<Integer, Integer>hm){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root= new TreeNode(pre[ps]);
        int inroot=hm.get(root.val);
        int nl=inroot-is;
        root.left=tree(pre, ps+1, ps+nl, in, is, inroot-1,hm);
        root.right=tree(pre, ps+nl+1, pe, in,inroot+1, ie, hm);
        return root;
    }
}