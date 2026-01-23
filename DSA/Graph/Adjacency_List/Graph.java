package Adjacency_List;
import java.util.*;

public class Graph {
  
  ArrayList<LinkedList<Node>> adjList;
  Graph() {
    adjList = new ArrayList<>();
  }
  public void addNode(Node node){
    LinkedList<Node> curr_List = new LinkedList<Node>();
    curr_List.add(node);
    adjList.add(curr_List);
    
  }
  public void addEdge(int src, int dest){
   LinkedList<Node> src_list =adjList.get(src);
   Node dest_node = adjList.get(dest).get(0);
    src_list.add(dest_node);

  }
  public boolean checkEdge(int src,int dest){
    LinkedList<Node> src_list = adjList.get(src);
    Node dest_node = adjList.get(dest).get(0);
    for(Node node:src_list){
      if(node == dest_node){
        return true;
      }
    }
    return false;
  }
  public void printGraph(){
    for(LinkedList<Node> curr_list:adjList){
      for(Node node:curr_list){
        System.out.print(node.data + " -> ");
      }
        System.out.println("  ");
    }
  }



 void dfs(int start) {
    boolean[] visited = new boolean[nodes.size()];
    dfsHelper(start, visited);
}

private void dfsHelper(int nodeIndex, boolean[] visited) {
    // Mark current node as visited and print it
    visited[nodeIndex] = true;
    System.out.print(nodes.get(nodeIndex).data + " ");

    // Visit all connected nodes that haven’t been visited
    for (int i = 0; i < matrix[nodeIndex].length; i++) {
        if (matrix[nodeIndex][i] == 1 && !visited[i]) {
            dfsHelper(i, visited);
        }
    }
}
}
