public class ReverseLevelOrderTraversal {
        List<Integer> tempHolder = new ArrayList<Integer>();
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        //go through each level and add item from left to right in tempHolder and when going to new level add that tempHolder to the list and then clear tempHolder
        int height = height(root);
        for(int i = height - 1 ; i > -1; i--) {
            visitLevel(root, i);
            returnList.add(deepCopy(tempHolder));
            tempHolder.clear();
        }
       return finalReturnList;

    }

    public void visitLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 0) {
            tempHolder.add(root.val);
        }
        else {
            visitLevel(root.left, level - 1);
            visitLevel(root.right, level - 1);
        }
    }
    public List<Integer> deepCopy(List<Integer> boo) {
        List<Integer> copy = new ArrayList<Integer>(boo.size());

        for (Integer foo: boo) {
             copy.add(foo);
        }
        return copy;
    }

    //need to figure out height of tree
    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = height(root.left);
        int rightDepth = height(root.right);

        int bigger = Math.max(leftDepth, rightDepth);

        return bigger+1;
    }
}
