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
      HashMap<Integer, Integer>hm=new HashMap<>();
      int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i], i);
        }
       TreeNode root=buildhere(preorder, 0, preorder.length-1);
       return root;
    }

    public TreeNode buildhere(int p[], int left, int right){
        if(left>right) return null;
        int node=p[preindex];
        preindex+=1;
        int iv=hm.get(node);
        TreeNode root=new TreeNode(node);
        root.left=buildhere(p, left, iv-1);
        root.right=buildhere(p, iv+1, right);
        return root;
    }
}