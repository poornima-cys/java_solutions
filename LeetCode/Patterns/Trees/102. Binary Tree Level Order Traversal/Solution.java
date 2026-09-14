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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> arr= new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return arr;
        q.offer(root);
        while(!q.isEmpty()){
            List add=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
            if(q.peek().left!=null){
                q.offer(q.peek().left);
            }
            if(q.peek().right!=null){
                q.offer(q.peek().right);
            }
           
           add.add( q.poll().val);

            }
            arr.add(add);
            }

        return arr;
    }
}