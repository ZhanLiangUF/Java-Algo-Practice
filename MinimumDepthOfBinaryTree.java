/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        int leftDepth;
        int rightDepth;
        int smaller;
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            smaller = minDepth(root.right);
            return smaller + 1;
        } else if (root.right == null) {
            smaller = minDepth(root.left);
            return smaller + 1;
        }
        leftDepth = minDepth(root.left);
        rightDepth = minDepth(root.right);

        smaller = Math.min(leftDepth,rightDepth);
        return smaller + 1;
    }


}
