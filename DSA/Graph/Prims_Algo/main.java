package util;

import java.util.*;

public class MinimumSpanningTree {

  public List<GraphEdge> primMST(WeightedGraph graph) {
    List<GraphEdge>[] vertices = graph.getVertices();

    boolean[] inMST = new boolean[vertices.length];
    PriorityQueue<GraphEdge> priorityQueue =
        new PriorityQueue<>(Comparator.comparingInt(GraphEdge::getWeight));

    List<GraphEdge> mstEdges = new ArrayList<>();

    // Start from vertex 0
    int startVertex = 0;
    inMST[startVertex] = true;

    // Add all edges from the start vertex to the priority queue
    priorityQueue.addAll(vertices[startVertex]);

    while (!priorityQueue.isEmpty()) {
      GraphEdge currentEdge = priorityQueue.poll();

      int destination = currentEdge.getDestination();

      // Skip if the destination is already in the MST
      if (inMST[destination]) continue;

      // Else add the current edge to the MST
      mstEdges.add(currentEdge);
      inMST[destination] = true;

      // Add all edges from the destination to the priority queue
      priorityQueue.addAll(vertices[destination]);
    }

    return mstEdges;
  }

  // Find the minimum spanning tree using Kruskal's algorithm


}