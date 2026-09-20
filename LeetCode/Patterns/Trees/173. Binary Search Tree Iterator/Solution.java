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
class BSTIterator {
    Stack<TreeNode>stk=new Stack<>();
    public BSTIterator(TreeNode root) {
        help(root);
    }
    
    public int next() {
        TreeNode temp=stk.pop();
        //int value=temp.val;
        help(temp.right);
        return temp.val;
    }
    
    public boolean hasNext() {
        return !stk.isEmpty();
    }
    public void help(TreeNode root){
        while(root!=null){
            stk.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */