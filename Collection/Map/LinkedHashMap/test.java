/*package Collection.Map.LinkedHashMap;

public class test {
  public static void main(String[] args) {
    java.util.LinkedHashMap<String, String> lhm = new java.util.LinkedHashMap<>();
    lhm.put("1", "Sanjay");
    lhm.put("2", "Praveen");
    lhm.put("3", "Anguraja");
    lhm.put("4", "Suriya");

    System.out.println(lhm);
    
    // Iterating through the LinkedHashMap
    for (Object key : lhm.keySet()) {
      System.out.println(key.getKey() + ": " + key.getValue());
    }
  }
}
*/
import java.util.*;

public class Main {
  public static void main(String[] args) {
    LinkedHashMap h = new LinkedHashMap();
    h.put(1,"Sanjay");
    h.put(2,"Kumar");
    h.put(3,"Ajay");
    System.out.print(h+" ");
    
  }
}