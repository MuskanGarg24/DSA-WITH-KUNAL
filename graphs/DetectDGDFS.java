import java.util.*;

public class DetectDGDFS {

    private boolean dfs(int vertex, List<List<Integer>> adj, boolean[] vis, boolean[] pathVS) {
        vis[vertex] = true;
        pathVS[vertex] = true;
        // traverse for adjacent vertex
        for (int it : adj.get(vertex)) {
            // when the vertex is not visited
            if (!vis[it]) {
                if (dfs(it, adj, vis, pathVS)) {
                    return true;
                }
            }
            // if the vertex has been previously visited
            // but it has to be visited on the same path
            else if (pathVS[it]) {
                return true;
            }
        }
        pathVS[vertex] = false;
        return false;
    }

    public boolean isCyclic(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] pathVS = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, pathVS)) {
                    return true;
                }
            }
        }
        return false;
    }
}
