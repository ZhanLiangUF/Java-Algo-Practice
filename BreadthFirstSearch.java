//Breadth First Search.
// - initialize a queue with a starting vertex s and mark that vertex
//        - let's call this the fringe.
// - repeat until queue is empty
//        - remove vertex v from queue
//         - add to the queue any unmarked vertices adjacent to v and mark them

public class BreadthFirstPaths {
  private boolean[] marked;
  private int[] edgeTo;

  private void bfs(Graph G, int s) {
    Queue<Integer> fringe = new Queue<Integer>();
    fringe.enqueue(s);
    marked[s] = true;
    while (!fringe.isEmpty()) {
      int v = fringe.dequeue();
      for (int w: G.adj(v)) {
        if(!marked[w]) {
          fringe.enqueue(w);
          marked[w] = true;
          edgeTo[w] = v;
        }
      }
    }
  }

}
