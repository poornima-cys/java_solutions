class Solution {
    int prev = Integer.MIN_VALUE;
    int diff = Integer.MAX_VALUE;

    public void help(TreeNode root) {
        if (root == null) {
            return;
        }

        help(root.left);

        if (prev != Integer.MIN_VALUE) {
            diff = Math.min(diff, root.val - prev);
        }

        prev = root.val;

        help(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        help(root);
        return diff;
    }
}