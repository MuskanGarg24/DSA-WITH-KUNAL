// given a directed acyclic graph. Find the shortest path from src to all the vertex
// topological sort

// step - 1 -> do a toposort on graph using dfs
// step - 2 -> take the nodes out of stock and relax the edges --> find distance array

import java.util.ArrayList;
import java.util.Stack;

public class DAG_ShortestPath {
    public class Pair {
        int first;
        int second;

        Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    // toposort function
    private void topoSort(int node, ArrayList<ArrayList<Pair>> adj, boolean[] vis, Stack<Integer> stack) {
        vis[node] = true;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int v = adj.get(node).get(i).first;
            if (!vis[v]) {
                topoSort(node, adj, vis, stack);
            }
        }
        stack.push(node);
    }

    public int[] shortestPath(int n, int m, int[][] edges) {
        // create graph
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Pair> temp = new ArrayList<>();
            adj.add(temp);
        }
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v, wt));
        }
        // find topo sort
        boolean[] vis = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                topoSort(i, adj, vis, stack);
            }
        }
        // do the distance thing
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = (int) (1e9);
        }

        dist[0] = 0;
        while (!stack.isEmpty()) {
            int node = stack.peek();
            stack.pop();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if (dist[node] + wt < dist[v]) {
                    dist[v] = wt + dist[node];
                }
            }
        }
        return dist;
    }
}
