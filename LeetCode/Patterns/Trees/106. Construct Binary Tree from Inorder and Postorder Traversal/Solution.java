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
    HashMap<Integer, Integer> hm=new HashMap<>();
    
    public TreeNode buildhere(int[] po, int left, int right, int[] postindex){
        if(right>left) return null;
        int node=po[postindex[0]];
        postindex[0]=postindex[0]-1;
        int inroot=hm.get(node);
        TreeNode root=new TreeNode(node);
        root.right=buildhere(po, left, inroot+1, postindex);
        root.left=buildhere(po, inroot-1, right, postindex);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        int postindex[]=new int[1];
        postindex[0]=inorder.length-1;
        TreeNode root=buildhere(postorder, postorder.length-1, 0, postindex);
        return root;
    }
}