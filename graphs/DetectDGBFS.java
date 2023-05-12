// Kahn's algorithm will be used

// if toposort exactly has V vertices --> no cycle present
// else --> cycle

import java.util.*;

public class DetectDGBFS {
    public boolean detectCycle(int V, List<List<Integer>> adj) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;
        while (!q.isEmpty()) {
            int vertex = q.peek();
            q.remove();
            count++;
            // vertex is in your toposort so remove it from your indegree
            for (int it : adj.get(vertex)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }

        if (count == V) {
            return false;
        }
        return true;
    }
}
