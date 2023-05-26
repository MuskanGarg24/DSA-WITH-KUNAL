// Minimum spanning tree
// A tree in which we have n nodes and n-1 edges and all nodes are reachable from each other.
// the smallest sum among all the spanning trees will be the minimum spanning tree
// prim's algorithm and kruskal's algorithm

// prim's algorithm

// time complexity: O(ElogE)
// space complexity: O(E)

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MST {
    public static class Pair {
        int node;
        int weight;

        Pair(int n, int w) {
            this.node = n;
            this.weight = w;
        }
    }

    static int spanningTree(int V, ArrayList<ArrayList<Integer>> adj) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> (x.weight - y.weight));
        int[] vis = new int[V];
        pq.add(new Pair(0, 0));
        int sum = 0;
        while (pq.size() != 0) {
            int node = pq.peek().node;
            int wt = pq.peek().weight;
            pq.remove();
            if (vis[node] == 1)
                continue;

            vis[node] = 1;
            sum += wt;
            for (int i = 0; i < adj.get(node).size(); i++) {
                int child = adj.get(node).get(i);
                if (vis[child] == 0) {
                    pq.add(new Pair(child, adj.get(node).get(i + 1)));
                }
            }
        }
        return sum;
    }
}
