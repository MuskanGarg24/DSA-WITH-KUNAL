// Adjancey list form

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 0, 4));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2, 3, 5));

        graph[3].add(new Edge(3, 1, 6));
        graph[3].add(new Edge(3, 2, 7));
    }

    // time complexity - O(V+E)
    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                // adding curr neighbours
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // if graph is in components
    public static void bfs(ArrayList<Edge> graph[], int V, boolean[] v, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!v[curr]) {
                System.out.print(curr + " ");
                v[curr] = true;
                // adding curr neighbours
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // time complexity - O(V+E)
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        System.out.print(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        // print 2's neighbours and weight
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest + " " + e.wt);
        }

        System.out.println("BFS traversal : ");
        bfs(graph, V);

        System.out.println("\nComponents BFS traversal");
        boolean[] v = new boolean[V];
        for (int i = 0; i < V; i++) {
            bfs(graph, V, v, i);
        }

        System.out.println("\nDFS traversal");
        dfs(graph, 0, v);

        System.out.println("\nif graph is in components then - ");
        for (int i = 0; i < V; i++) {
            if(v[i] == false){
                dfs(graph, i, v);
            }
        }
    }
}