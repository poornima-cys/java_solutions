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
    class Triple {
        TreeNode node;
        int vl;
        int l;

        Triple(TreeNode Node, int vl, int l) {
            this.node = Node;
            this.vl = vl;
            this.l = l;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<Triple> q = new LinkedList<>();
        q.add(new Triple(root, 0, 0));
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tm = new TreeMap<>();
        while (!q.isEmpty()) {
            Triple temp = q.poll();
            TreeNode curr = temp.node;
            int vlevel = temp.vl;
            int level = temp.l;
            if (!tm.containsKey(vlevel)) {
                tm.put(vlevel, new TreeMap<>());
            }
            if (!tm.get(vlevel).containsKey(level)) {
                tm.get(vlevel).put(level, new PriorityQueue<>());
            }
            tm.get(vlevel).get(level).offer(curr.val);
            if (curr.left != null) {
                q.offer(new Triple(curr.left, vlevel - 1, level + 1));
            }
            if (curr.right != null) {
                q.offer(new Triple(curr.right, vlevel + 1, level + 1));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> tree : tm.values()) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (PriorityQueue<Integer> n : tree.values()) {
                while (!n.isEmpty()) {
                    arr.add(n.poll());
                }
               
            }
             res.add(arr);
        }
        return res;
    }

}
