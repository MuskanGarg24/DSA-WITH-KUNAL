// find strongly connected components
// only valid for directed graphs

// algorithm -

// 1 - sort all the edges according to reach
// 2 - reverse the graph
// 3 - do a dfs

import java.util.ArrayList;
import java.util.Stack;

public class KosarajuAlgo {

    // function for dfs call
    private void dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
        vis[node] = 1;
        for (Integer it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, adj, st);
            }
        }
        st.push(node);
    }

    // function for dfs3 call
    private void dfs3(int node, int[] vis, ArrayList<ArrayList<Integer>> adjT) {
        vis[node] = 1;
        for (Integer it : adjT.get(node)) {
            if (vis[it] == 0) {
                dfs3(node, vis, adjT);
            }
        }
    }

    // function to find number of strongly connected components in graph
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, adj, st);
            }
        }

        // reverse a graph
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adjT.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < V; i++) {
            vis[i] = 0;
            for (Integer it : adj.get(i)) {
                adjT.get(it).add(i);
            }
        }

        // count connected components
        int scc = 0;
        while (!st.isEmpty()) {
            int node = st.peek();
            st.pop();
            if (vis[node] == 0) {
                scc++;
                dfs3(node, vis, adj);
            }
        }

        return scc;
    }
}
