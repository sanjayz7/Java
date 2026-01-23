package DSA.Graph;

public class AdjacencyMatrix {
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
Enter number of vertices: 4
Enter number of edges: 5
Enter edges (u v):
0 1
0 2
1 2
1 3
2 3
*/


    static int adjMatrix[][] ;
    
   static int v;
    AdjacencyMatrix(int v){
        this.v=v;
        adjMatrix= new int[v][v]; 
        //create the v matrix with v by v ;
    }
    public static void addEdge(int i,int j){
        adjMatrix[i][j] = 1;
         adjMatrix[j][i] = 1;
    }
       public static void removeEdge(int i,int j){
        adjMatrix[i][j] = 0;
         adjMatrix[j][i] = 0;
    }
    public static void printMatrix(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print( adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
    }
    public static void main(String[] args) {
    AdjacencyMatrix g = new AdjacencyMatrix(4);
       g.addEdge(0,1);
        g.addEdge(0,2);
         g.addEdge(0,3);
          g.addEdge(1,3);
           g.addEdge(2,3);
           printMatrix();
            g.removeEdge(1,3);
           g.removeEdge(2,3);
           printMatrix();
       
    }

}
