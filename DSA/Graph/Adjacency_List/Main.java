package Adjacency_List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Adjacency List Graph Implementation");

    Graph graph = new Graph();
    graph.addNode(new Node('A'));
    graph.addNode(new Node('B'));
    graph.addNode(new Node('C')); 
    graph.addNode(new Node('D'));
    graph.addNode(new Node('E'));


    graph.addEdge(0, 1);
    graph.addEdge(0, 3);
    graph.addEdge(0, 2);
    graph.addEdge(1, 4);
    graph.addEdge(1, 0);
    graph.addEdge(1, 3);
    graph.addEdge(2, 3);
    graph.addEdge(2, 0);
    graph.addEdge(3, 0);
    graph.addEdge(3, 1);
    graph.addEdge(3, 0);
    graph.addEdge(3, 4);
    graph.addEdge(3, 2);
    graph.addEdge(4, 1);
    graph.addEdge(4,3);
    graph.dfs(0);
    System.out.println();
    graph.printGraph();

    
    
  }

}
