// bipartite graph
// color the graph with 2 colors such that no adjacent vertex have same color
// linear graphs with no cycle are always bipartite
// any graph with even cycle length is also a bipartite graph

// BFS traversal
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class BipartiteBFS {
    private boolean check(int start, int V, List<List<Integer>> adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while (!q.isEmpty()) {
            int vertex = q.peek();
            q.remove();
            for (int it : adj.get(vertex)) {
                // if the adjacent vertex is not yet colored
                // you will give the opposite color of the vertex
                if (color[it] == -1) {
                    color[it] = 1 - color[vertex];
                    q.add(it);
                }
                // is the adjacent vertex have the same color
                // means someone has already colored it with some other path
                else if (color[vertex] == color[it]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int V, List<List<Integer>> adj) {
        int[] color = new int[V];
        for (int i = 0; i < V; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!check(i, V, adj, color)) {
                    return false;
                }
            }
        }
        return true;
    }
}
