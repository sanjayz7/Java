
import java.util.*;

public class Dequeue {
  public static void main(String[] args) {
       Deque<Integer> q = new LinkedList<Integer>();
       q.add(22);
      q.add(23);
      q.offer(24);
      q.addFirst(5);
      q.addLast(50);
      System.out.println(q);

  }
 
}
