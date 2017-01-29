//
// Invert a binary tree.
//      4
//    /   \
//   2     7
//  / \   / \
// 1   3 6   9
// to
//      4
//    /   \
//   7     2
//  / \   / \
// 9   6 3   1


import java.util.*;

public class InvertBST {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {

  }

  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      invertTreeHelper(root);
    }
    return root;
  }

  public void invertTreeHelper(TreeNode root) {
    // swap root.left and root.left
    TreeNode tempNode = root.left;
    root.left = root.right;
    root.right = tempNode;
    //recursively continue to do so until you hit null on left or right
    if (root.left != null) {
      invertTreeHelper(root.left);
    }
    if (root.right != null) {
      invertTreeHelper(root.right);
    }
  }
}
