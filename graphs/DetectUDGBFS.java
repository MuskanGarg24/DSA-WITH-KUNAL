import java.util.*;;

public class DetectUDGBFS {

    static class Pair {
        int first;
        int second;

        public Pair(int f, int s) {
            this.first = f;
            this.second = s;
        }
    }

    public static boolean detectCycle(int src, int V, List<List<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while (!q.isEmpty()) {
            int vertex = q.peek().first;
            int parentVertex = q.peek().second;
            q.remove();
            for (int adjacentNode : adj.get(vertex)) {
                if (vis[adjacentNode] == false) {
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, vertex));
                } else if (parentVertex != adjacentNode) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                if (detectCycle(i, V, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}
