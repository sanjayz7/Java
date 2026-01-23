// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class linkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next=null;
        }
    }
    static Node head=null;
    static Node tail=null;
    static int count =0;
    static int size(){
        return count;
    }
  static  boolean isEmpty(){
        return count==0;
    }
    
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
  public static void addFirst(int x){
      count++;
      if(head==null){
          head=new Node(x);
          tail=head;
          return ;
      }
      Node t=new Node(x);
      t.next = head;
      head=t;
  }
    public static void addLast(int x){
      count++;
      if(head==null){
          head=new Node(x);
          tail=head;
          return ;
      }
      
      Node t=new Node(x);
      tail.next=t;
     tail=t;
  }
  public static void insert(int pos, int x){
    if(pos <= 0){
        addFirst(x);
        return;
    }
    if(pos >= count){ // allow insertion at the end
        addLast(x);
        return;
    }
    count++;
    Node th = head;
    while(pos > 1){
        th = th.next;
        pos--;
    }
    Node t = new Node(x);
    t.next = th.next;
    th.next = t;
}

  /* 
  public static void insert(int pos,int x){
      if(pos<=0){
          addFirst(x);
      
          return;
      }
      if(pos>count){
          addLast(x);
          return;
      }
      count++;
      
      Node th =head;
      while(pos!=1){
          th = th.next;
          pos--;
      }
      Node t =  new Node(x);
      t = th.next;
      th.next=t;
      
  }
  */
  public static void deleteFirst(){
      if(head==null){
          System.out.print("List Empty");
          return;
      }
      count--;
      if(head==tail){
          head=tail=null;
          return;
      }
      head=head.next;
  }
  public static void deleteLast(){
      if(head==null){
          System.out.print("List Empty");
          return ;
      }
      count--;
      if(head==tail){
          head=tail=null;
          return;
      }
      Node th = head;
      while(th.next!=tail){
          th=th.next;
      }
      tail=th;
      th.next=null;
  }
  public static void delete(int pos){
      Node th =head;
      Node temp=null;
       if(head==null){
          System.out.print("List Empty");
          return ;
      }
      if(pos<=0){
          deleteFirst();
          return;
      }
      if(pos>size()-1){
          deleteLast();
          return;
      }
      count --;
      while(pos>1){
          th=th.next;
          pos--;
      }
      temp=th.next;
      th.next=temp.next;
      temp=null;
  }
    
    public static void main(String a[]){
        linkedList l=new linkedList();
        l.addFirst(10);
         l.addFirst(20);
          l.addFirst(30);
           l.addFirst(40);
           l.addFirst(50);
           l.addLast(60);
           //out  50 40 30 20 10 60
           l.printList(head);
           System.out.println();
            System.out.println(l.size());
             System.out.println(isEmpty());
           
           l.insert(3,44);
           l.printList(head);
            System.out.println();
           l.deleteFirst();
            System.out.println();
        l.printList(head);
          System.out.println();
        l.deleteLast();
        l.printList(head);
        System.out.println();
        l.delete(3);
        l.printList(head);
    }
    
}

