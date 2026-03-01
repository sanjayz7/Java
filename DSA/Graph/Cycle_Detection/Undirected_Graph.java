import java.util.*;

class Graph {
    private int V; // number of vertices
    private List<List<Integer>> adj;

    // Constructor
    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge (undirected)
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // DFS function
    boolean dfs(int src, int parent, boolean[] visited) {
        visited[src] = true;

        for (int neighbor : adj.get(src)) {

            // If not visited, explore
            if (!visited[neighbor]) {
                if (dfs(neighbor, src, visited))
                    return true;
            }
            // If visited and not parent → cycle
            else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    // Main function to check cycle
    boolean isCycle() {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited))
                    return true;
            }
        }
        return false;
    }

    // Driver
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);  // cycle here
        g.addEdge(3, 4);

        if (g.isCycle())
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}