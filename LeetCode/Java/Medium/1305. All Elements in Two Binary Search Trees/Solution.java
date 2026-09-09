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
    ArrayList<Integer> a=new ArrayList<>();
    ArrayList<Integer> b=new ArrayList<>();
    ArrayList<Integer> c=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        insert(root1, a);
        insert(root2, b);
        compare(a,b);
        return c;
    }
    public void insert(TreeNode root, ArrayList<Integer>aa){
        if(root==null)return;
        insert(root.left,aa);
        aa.add(root.val);
        insert(root.right, aa);
    }
    public void compare(ArrayList<Integer>a, ArrayList<Integer>b){
        int i=0, j=0;
        while(i<a.size() && j<b.size()){
            if(a.get(i)<=b.get(j)){
                c.add(a.get(i));
                i+=1;
            }
            else{
                c.add(b.get(j));
                j+=1;
            }
        }
       
            while(i<a.size()){
                c.add(a.get(i));
                i+=1;
            }
             while(j<b.size()){
                c.add(a.get(j));
                j+=1;
            }
    }
}