/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class FindBottomLeftValue {
    // when doing traversal how to get depth and value at the same time and know that
    // it is on the left side of a node
    public int findBottomLeftValue(TreeNode root) {


   public int findBottomLeftValue(TreeNode root) {
       return findBottomLeftValue(root, 1, new int[]{0,0});
   }

   public int findBottomLeftValue(TreeNode root, int depth, int[] res) {
       if (res[1] < depth) {
           res[0]=root.val;
           res[1]= depth;
       }
       System.out.print(root.val);
       if (root.left != null) {
           findBottomLeftValue(root.left, depth+1, res);
       }
       if (root.right != null) {
           findBottomLeftValue(root.right, depth+1, res);
       }
       return res[0];
   }

    }

}
