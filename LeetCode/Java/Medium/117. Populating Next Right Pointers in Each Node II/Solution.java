/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node>q=new LinkedList<>();
        if(root==null)return root;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int c=0;
            for(int i=0;i<size;i++){
                Node node= q.poll();
                System.out.println (node.val);
                if(c<size-1){
                    node.next=q.peek();
                }
                else{
                    node.next=null;
                }
                c+=1;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}