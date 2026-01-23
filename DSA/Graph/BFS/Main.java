package Adjacency_Matrix;

public class Main {
  public static void main(String []a){
    Graph g = new Graph(5);
    g.addNode('A');
    g.addNode('B');
    g.addNode('C');
    g.addNode('D');
    g.addNode('E');
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 1);
    g.addEdge(1, 3);
    g.addEdge(3, 4);
   

    g.printMatrix();
    g.dfs(0);

  
  }
}


