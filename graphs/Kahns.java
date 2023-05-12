// topological sorting - BFS - Kahn's Algorithm

// step1 - insert all nodes with indegree 0 in queue
// step2 - take them out of the queue and decrease the indegree of adjacent nodes

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Kahns {
    public int[] topoSort(int V, List<List<Integer>> adj) {
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
        int[] topo = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int vertex = q.peek();
            q.remove();
            topo[i++] = vertex;
            // vertex is in your toposort so remove it from your indegree
            for (int it : adj.get(vertex)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
