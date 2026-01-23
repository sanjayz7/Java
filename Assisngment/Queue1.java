
import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<Integer>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        myQueue.offer(4);
        System.out.println(myQueue);
        System.out.println(myQueue.element());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
    }
}
