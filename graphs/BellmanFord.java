// Bellman Ford's algorithm - shortest path
// dijkstra fail - negative edges and TLE when negative cycle
// it helps you to detect negative cycles
// convert a undirected graph to directed graph

// single source shortest path algorithm

import java.util.ArrayList;

public class BellmanFord {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            dist[i] = (int) (1e8);
        }
        dist[S] = 0;
        // V X E
        // relaxation
        for (int i = 0; i < V - 1; i++) {
            for (ArrayList<Integer> it : edges) {
                int u = it.get(0);
                int v = it.get(1);
                int w = it.get(2);
                if (dist[u] != 1e8 && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        // Nth relaxation to check negative cycle
        for (ArrayList<Integer> it : edges) {
            int u = it.get(0);
            int v = it.get(1);
            int w = it.get(2);
            if (dist[u] != 1e8 && dist[u] + w < dist[v]) {
                return new int[] { -1 };
            }
        }
        return dist;
    }
}