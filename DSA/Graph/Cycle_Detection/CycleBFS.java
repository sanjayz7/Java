import java.util.*;

public class CycleBFS {
    static class Pair {
        int node, parent;
        Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    // BFS to check cycle in an undirected graph
    public static boolean hasCycle(int start, boolean[] visited, List<List<Integer>> graph) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(start, -1));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            for (int neighbor : graph.get(current.node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new Pair(neighbor, current.node));
                } else if (neighbor != current.parent) {
                    // Already visited and not parent → cycle
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 3; // number of nodes
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        // Add undirected edges
        graph.get(0).add(1); graph.get(1).add(0);
        graph.get(0).add(2); graph.get(2).add(0);
        graph.get(1).add(2); graph.get(2).add(1);

        boolean[] visited = new boolean[n];

        if (hasCycle(0, visited, graph))
            System.out.println("Cycle Detected 🚨");
        else
            System.out.println("No Cycle 🎉");
    }
}
