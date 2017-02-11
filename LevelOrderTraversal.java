// Level-Order Traversal through iterative deepening

public class LevelOrderTraversal {

public void levelOrder(Tree T, Action toDo) {
  for (int i = 0; i < T.height(); i += 1) {
    visitLevel(T,i whatToDo);
  }
}
public void visitLevel(Tree T, int level, Action toDo) {
  if (T == null)
  {return;}
  if (level == 0)
  { toDo.visit(T.key)}
  else {
  visitLevel(T.left(), lev - 1);
  visitLevel(T.right(), lev - 1)
  }

}

}
