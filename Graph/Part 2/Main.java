
import java.util.ArrayList;

public class Main {

    public static class Edge {

        int src;
        int dest;

        // Constructor to initialize the source and destination vertices of the edge
        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean isVisited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!isVisited[i] && isCycleUtil(graph, isVisited, i, -1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCycleUtil(ArrayList<Main.Edge>[] graph, boolean[] isVisited, int curr, int parent) {
        isVisited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if (!isVisited[e.dest]) {
                if (isCycleUtil(graph, isVisited, e.dest, curr)) {
                    return true;
                }
            } else if (isVisited[e.dest] && e.dest != parent) {
                return true;
            }
        }
        return false;
    }

    // Function to create the graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Node 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Node 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // Node 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        // Node 3
        graph[3].add(new Edge(3, 0));

        // Node 4
        graph[4].add(new Edge(4, 2));
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));  // Should output false as there is no cycle in the given graph

    }
}
