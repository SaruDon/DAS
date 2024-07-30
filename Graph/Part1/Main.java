
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static class Edge {

        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void bfs(ArrayList<Edge>[] graph) {
        boolean isVisited[] = new boolean[graph.length];
        for (int i = 0; i < isVisited.length; i++) {
            if (!isVisited[i]) {
                UtilBfs(graph, i, isVisited);
            }
        }
    }

    public static void UtilBfs(ArrayList<Edge>[] graph, int start, boolean isVisited[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!isVisited[curr]) {
                System.out.print(curr + " ");
                isVisited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!isVisited[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph) {
        boolean isVisited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!isVisited[i]) {
                utilDfs(graph, i, isVisited);
            }
        }
    }

    public static void utilDfs(ArrayList<Edge>[] graph, int curr, boolean isVisited[]) {

        System.out.print(curr + " ");
        isVisited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVisited[e.dest]) {
                utilDfs(graph, e.dest, isVisited);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean isVisisted[]) {
        if (src == dest) {
            return true;
        }
        isVisisted[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!isVisisted[e.dest] && hasPath(graph, e.dest, dest, isVisisted)) {
                return true;
            }
        }
        return false;
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        //vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 4, 1));

        // vertex 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        // vertex 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //vertext 6 
        graph[6].add(new Edge(6, 5, 1));

    }

    public static void main(String[] args) {

        // int v = 5;
        // ArrayList<Edge>[] graph = new ArrayList[v];
        // for (int i = 0; i < graph.length; i++) {
        //     graph[i] = new ArrayList<>();
        // }
        // //vertex 0
        // graph[0].add(new Edge(0, 1, 5));
        // //vertex = 1
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 3));
        // //vertex 2
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[2].add(new Edge(2, 4, 2));
        // //vertex 3
        // graph[3].add(new Edge(3, 2, 1));
        // graph[3].add(new Edge(3, 1, 3));
        // //vertex 4
        // graph[4].add(new Edge(4, 2, 2));
        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.dest);
        // }
        int v = 7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
        // dfs(graph);
        // System.out.println(hasPath(graph, 0, 7, new boolean[v]));
    }
}
