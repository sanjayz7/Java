// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Graph {
    static int v;
    static LinkedList<Integer>list[];
@SuppressWarnings("unchecked")
Graph(int v){
this.v=v;

list= new LinkedList[v];
for(int i=0;i<v;i++)
list[i]  = new LinkedList<>();
} 
    static void addEgde(int i,int j){
        list[i].addFirst(j);
        list[j].addFirst(i);
         
    }
    static void display(){
        
        for(int i=0;i<v;i++){
            if(list[i].size()>0){
                System.out.print("Vertex "+i+"-->");
                for(int j=0;j<list[i].size();j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Graph g =  new Graph(5);
      
      addEgde(0,1);
      addEgde(0,2);
      addEgde(1,4);
      addEgde(1,3);
      addEgde(2,3);
      addEgde(3,4);
      
      display();
    }
  }