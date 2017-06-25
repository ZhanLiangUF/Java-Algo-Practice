/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LevelOrderToFindRightMostView {

    ArrayList<Integer> myArray = new ArrayList<Integer>();
    ArrayList<Integer> levelArray = new ArrayList<Integer>();

    public List<Integer> rightSideView(TreeNode root) {
       int height = computeMaxDepthOfTree(root);
       for (int i = 0; i < height; i++) {
           visitLevel(root,i);
           int max = returnRightValue(levelArray);
           levelArray = new ArrayList<Integer>();
           myArray.add(max);
       }
       return myArray;


    }

    public int returnRightValue(ArrayList<Integer> arr) {

        return arr.get(arr.size() - 1);
    }

    public int computeMaxDepthOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = computeMaxDepthOfTree(root.left);
        int rightDepth = computeMaxDepthOfTree(root.right);
        return Math.max(leftDepth,rightDepth) + 1;

    }

    public void visitLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 0) {
            levelArray.add(root.val);
        }
        visitLevel(root.left, level - 1);
        visitLevel(root.right, level - 1);
    }


}
