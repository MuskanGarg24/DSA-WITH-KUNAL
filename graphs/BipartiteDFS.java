import java.util.*;

public class BipartiteDFS {
    private boolean dfs(int vertex, int col, int[] color, List<List<Integer>> adj) {
        color[vertex] = col;
        for (int it : adj.get(vertex)) {
            if (color[it] == -1) {
                if (!dfs(it, 1 - col, color, adj)) {
                    return false;
                }
            } else if (color[it] == col) {
                return false;
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
                if (!dfs(i, 0, color, adj)) {
                    return false;
                }
            }
        }
        return true;
    }
}
