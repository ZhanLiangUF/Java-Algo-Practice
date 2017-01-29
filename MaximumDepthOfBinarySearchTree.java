// Given a binary tree, find its maximum depth.
// The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


public class MaximumDepthOfBinarySearchTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
      val = x;
    }
  }
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    int bigger = Math.max(leftDepth, rightDepth);
    return bigger + 1;
  }
}
