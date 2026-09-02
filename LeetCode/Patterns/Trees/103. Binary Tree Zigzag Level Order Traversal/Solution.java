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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        int flag=-1;
        Queue<TreeNode>q=new LinkedList<>(); 
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
    
        q.add(root);
        //res.add(new ArrayList<>(root.val));
        while(!q.isEmpty()){
            flag*=-1;
           // TreeNode node=q.poll();
            int n=q.size();
            ArrayList<Integer> arr=new ArrayList<>();

            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                arr.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                   // arr.add(node.left.val);
                }
                if(node.right!=null){
                    q.add(node.right);
                    // arr.add(node.right.val);
                    }
                    // q.poll();
                
            }
            if(flag==1){
                res.add(arr);
            }
            else{
                    Collections.reverse(arr);
                    res.add(arr);
            }
           
            }

        
        return res;
    }
}