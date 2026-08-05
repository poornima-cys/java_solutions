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
    public int maxDepth(TreeNode root) {
        // METHOD 1 -> USING BFS
        // int levels=0;
        // //int max_level=0;
        // Queue<TreeNode>q=new LinkedList<>();
        // if(root==null)
        // return 0;
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int each_level_nodes=q.size();
        //     for(int i=0; i<each_level_nodes;i++){
        //         if(q.peek().left!=null){
        //             q.offer(q.peek().left);
        //         }
        //          if(q.peek().right!=null){
        //             q.offer(q.peek().right);
        //         }
        //         q.poll();
        //     }
        //     levels++;
        //     //max_levels=Math.max(max_level, levels);
        // }
        //     return levels;
        
        
        //METHOD 2 -> USING RECURSION
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}