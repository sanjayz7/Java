// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MyStack{
       private Queue<Integer> q;
         MyStack(){
            q= new LinkedList<>();
            }
         void push(int x){
           q.add(x);
           for(int i=1;i<q.size();i++){
               q.add(q.remove());
           }
       }
        int pop(){
           return q.remove();
           
       }
        int top (){
           return q.peek();
       }
       void display(){
           while(!q.isEmpty()){
               System.out.println(q.remove());
           }
       }
    
}

class Main {
 
    public static void main(String[] args) {
       MyStack q= new MyStack();
     
       
      
       q.push(4);
       q.push(8);
       q.push(15);
       int a=q.pop();
      q.display();
      System.out.println("Element poped out is : "+a);
       
       
    }
}