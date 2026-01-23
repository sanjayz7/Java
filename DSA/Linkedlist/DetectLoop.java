/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}



class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        Node temp = head;
         
             HashMap<Node, Integer> h1 = new HashMap<>();
         
         while(temp!=null){
            if(h1.containsValue(temp.data)){
             
             
               return true;
               
         }
       
          h1.put(temp,temp.data);
            
            temp= temp.next;
         }
         
        return false;
         
         
        
    }
}*/