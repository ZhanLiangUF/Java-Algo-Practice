// Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.
//
// Assume a BST is defined as follows:
//
// The left subtree of a node contains only nodes with keys less than or equal to the node's key.
// The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
// Both the left and right subtrees must also be binary search trees.
// For example:
// Given BST [1,null,2,2],

public class FindModeInBST {
  Map<Integer,Integer> extraSpace = new HashMap<Integer,Integer>();
   public int[] findMode(TreeNode root) {
       putNodesInHashMap(root);
       Integer largestVal = null;
   List<Integer> largestList = new ArrayList<Integer>();
   for (Map.Entry<Integer, Integer> entry : extraSpace.entrySet()) {
   Integer key = entry.getKey();
   Integer value = entry.getValue();
   if (largestVal == null || largestVal < value) {
       largestVal = value;
       largestList.clear();
       largestList.add(key);
   } else if(largestVal == value) {
       largestList.add(key);
   }
   }
    int []returnArray = new int[largestList.size()];
   for(int i =0; i< returnArray.length; i++) {
       returnArray[i] = largestList.get(i);
   }
   return returnArray;

   }
   //InOrder traversal(but really doesn't matter)
   public void putNodesInHashMap(TreeNode root) {
       if (root == null) {
           return;
       }
       if (extraSpace.get(root.val) != null) {
           int temp = extraSpace.get(root.val);
           extraSpace.put(root.val, temp+1);
       } else {
       extraSpace.put(root.val, 1);
       }
       putNodesInHashMap(root.left);
       putNodesInHashMap(root.right);

   }
}
