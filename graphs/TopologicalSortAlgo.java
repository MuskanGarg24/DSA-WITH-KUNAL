// only exist in direct acyclic graphs
// linear ordering of vertices such that if there is an edge between u and v, u appears before v in their ordering
// DFS

import java.util.List;
import java.util.Stack;

public class TopologicalSortAlgo {

    private static void dfs(int vertex, boolean[] vis, Stack<Integer> stack, List<List<Integer>> adj) {
        vis[vertex] = true;
        for (int it : adj.get(vertex)) {
            if (!vis[it]) {
                dfs(it, vis, stack, adj);
            }
        }
        stack.push(vertex);
    }

    public int[] topSort(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, vis, stack, adj);
            }
        }
        int[] ans = new int[V];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i++] = stack.peek();
            stack.pop();
        }
        return ans;
    }
}
