import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }    
}
class Stack{
    Node head;
    Stack(){
        Node head=null;
    }
    void push(int data){
        Node node= new Node(data);
        node.next=head;
        head=node;
    }
    void pop(){
       int num=head.data;
        head=head.next;
      
    }
    void peek(){
        if(head==null) System.out.println("Empty");
         System.out.println(head.data);
    }
    void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("Empty");            
        }
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
            if(temp!=null) System.out.print("->");
        }        
    }
}
class Main{
    public static void main(String[] args){
        Stack s=new Stack();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            switch(a){
                case 1:
                    int b=sc.nextInt();
                    s.push(b);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    System.out.println("Invalid choice");                 
                    
           }
        }
        s.display();       
        
    }
}
