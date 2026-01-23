import java.util.*;

public class Main {
  public static void main(String[] args) {
      
    HashSet h1 = new HashSet();
    System.out.println(h1.isEmpty());
    h1.add('A');
    h1.add("Ball");
    h1.add("Cat");
    h1.add(null);
    h1.add(3);
    System.out.println(h1);
    HashSet h2 = new HashSet();
    h2.addAll(h1);
    System.out.println(h2);
   System.out.println(h2.contains('A'));
   //use for_each loop
   for(Object obj :h2)
   System.out.print(obj+" ");
   System.out.println();
   //using Iterator
   Iterator it = h2.iterator();
   while(it.hasNext())
   System.out.print(it.next()+" ");
   
  }
  
}
