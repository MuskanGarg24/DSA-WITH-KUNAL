// shortest path in undirected weighted graph using Dijkstra's algorithm
// start = 1 , end = n

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPath {
    class Pair {
        int wt;
        int vertex;

        Pair(int w, int v) {
            this.wt = w;
            this.vertex = v;
        }
    }

    public static List<Integer> shortestPath(int n, int m, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(new Pair(edges[i][1], edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0], edges[i][2]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.wt - y.wt);
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dist[i] = (int) (1e9);
            parent[i] = i;
        }

        dist[1] = 0;
        pq.add(new Pair(0, 1));

        while (pq.size() != 0) {
            int distance = pq.peek().wt;
            int node = pq.peek().vertex;
            pq.remove();
            for (Pair iter : adj.get(node)) {
                int adjNode = iter.vertex;
                int edgN = iter.wt;
                if (distance + edgN < dist[adjNode]) {
                    dist[adjNode] = distance + edgN;
                    pq.add(new Pair(distance + edgN, adjNode));
                    parent[adjNode] = node;
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        if (dist[n] == 1e9) {
            path.add(-1);
            return path;
        }
        int node = n;
        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(1);
        Collections.reverse(path);
        return path;
    }
}
