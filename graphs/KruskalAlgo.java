// Kruskal's Algorithm
// helps to find MST

// SORT ALL THE EDGES ACCORDING TO WEIGHT
// FIND THE NODES THAT ARE NOT IN THE SAME COMPONENT AND ADD THEIR WEIGHTS

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge> {
    int src;
    int dest;
    int wt;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }

    public int compareTo(Edge compareEdge) {
        return this.wt - compareEdge.wt;
    }
}

public class KruskalAlgo {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        List<Edge> edges = new ArrayList<Edge>();
        // O(N+E)
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                int node = i;
                Edge temp = new Edge(node, adjNode, wt);
                edges.add(temp);
            }
        }
        Disjoint ds = new Disjoint(V);
        // M log M
        Collections.sort(edges);
        int mstWt = 0;

        // M X 4 X alpha
        for (int i = 0; i < edges.size(); i++) {
            int wt = edges.get(i).wt;
            int u = edges.get(i).src;
            int v = edges.get(i).wt;

            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                ds.unionBySize(u, v);
            }
        }
        return mstWt;
    }
}
