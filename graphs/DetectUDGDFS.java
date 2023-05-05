import java.util.*;

public class DetectUDGDFS {

    private static boolean dfs(int vertex, int parent, boolean[] vis, List<List<Integer>> adj) {
        vis[vertex] = true;
        for (int adjacentNode : adj.get(vertex)) {
            if (!vis[vertex]) {
                if (dfs(adjacentNode, vertex, vis, adj)) {
                    return true;
                } else if (adjacentNode != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, vis, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

}
