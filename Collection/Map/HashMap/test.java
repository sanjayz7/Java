import java.util.*;

public class test {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    
    // Adding elements to the HashMap
    map.put("Apple", 1);
    map.put("Banana", 2);
    map.put("Cherry", 3);
    
    // Displaying the HashMap
    System.out.println("HashMap: " + map);
    map.put("Carrot",1);
     System.out.println("Updated HashMap: " + map);
    // Checking if a key exists
    System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));
    
    // Checking if a value exists
    System.out.println("Contains value 2: " + map.containsValue(2));
    
    // Iterating over the keys
    System.out.println("Keys in the HashMap:");
    for (String key : map.keySet()) {
      System.out.println(key);
    }
    
    // Iterating over the values
    System.out.println("Values in the HashMap:");
    for (Object value : map.values()) {
      System.out.println(value);
    }
    
    // Using an entry set to iterate over key-value pairs
    System.out.println("Key-Value pairs in the HashMap:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
