class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data+" ->");
            temp=temp.next;
        }
    }
    public static void printList1(Node head){
        Node temp=head;
        System.out.println();
        System.out.print(" "+temp.data+" ->");
        System.out.print(" "+temp.next.data+" ->");
        System.out.print(" "+temp.next.next.data+" ->");
        
        
System.out.print(" "+temp.next.next.next.data+" ->");
    }
    public static void main(String a[]){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next=n2;
        n2.next= n3;
        n3.next=n4;
        Node head = n1;
        printList(head);
        printList1(head);//Method 2 it is not professional way to execute
    }
}