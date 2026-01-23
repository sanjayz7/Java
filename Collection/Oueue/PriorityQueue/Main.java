import java.util.*;

public class Main{
  public static void main(String[] args) {
      Queue<String> q1 = new PriorityQueue<String>();
      q1.add("Sanjay");
      q1.add("Praveen");  
      q1.add("Anguraja");
      q1.add("Suriya");
      q1.offer("Suriya");
      System.out.println(q1);
      System.out.println("Head of the queue: " + q1.peek());
      System.out.println("Removing head: " + q1.poll());
      System.out.println("Queue after removing head: " + q1);
      System.out.println("Is queue empty? " + q1.isEmpty());
      System.out.println("Queue size: " + q1.size());
      System.out.println("Iterating through the queue:");
      for (Object element : q1) {
          System.out.println(element);
      }
      q1.offer("Sai");
      System.out.println("Queue after adding 'Sai': " + q1);
      q1.remove("Anguraja");

      System.out.println("Queue after removing 'Anguraja': " + q1);
      q1.poll();
        System.out.println("Queue after removing peek: " + q1);
  }
}
