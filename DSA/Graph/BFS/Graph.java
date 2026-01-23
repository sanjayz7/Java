package Adjacency_Matrix;

import java.util.ArrayList;
import java.util.Queue;

import Collection.LinkedList.LinkedList;

public class Graph {
  int matrix[][];
  ArrayList<Node> nodes ;
    Graph(int size) {
    matrix = new int[size][size];
    nodes = new ArrayList<Node>();
    
  } 

  void addNode(char data) {
    // Node addition logic can be implemented if needed
    nodes.add(new Node(data));

    
  }

  void addEdge(int src, int dest) {
    matrix[src][dest] = 1;
    matrix[dest][src] = 1; // For undirected graph
  }
  void removeEdge(int src, int dest) {
    matrix[src][dest] = 0;
    matrix[dest][src] = 0; // For undirected graph
  }

  void removeNode(Node node) {
    // Node removal logic can be implemented if needed
    nodes.remove(node);
  }

  
  void printMatrix() {
    System.out.print("  ");
    for(Node node : nodes){
      System.out.print(node.data + " ");
    }
    System.out.println();
    for (int i = 0; i < matrix.length; i++) {
       System.out.print(nodes.get(i).data + " ");
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

 

private void bfs(int src){
    boolean visited[] = new boolean[matrix.length];

    Queue<Integer> q= new LinkedList<>();
    q.offer(src);
    visited[src]= true;
    while(q.size()!=0){
      int curr_node = q.poll();
      System.out.print(nodes.get(curr_node).data+" ");

      for(int i=0;i<matrix[curr_node].length;i++){
        if(matrix[curr_node][i]==1 && !visited[i]){
          q.offer(i);
          visited[i]= true;
        }
      }
      System.out.println();
    }

}

}


