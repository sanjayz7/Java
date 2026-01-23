import java.util.*;



public class test {
  public static void main(String[] args) {
    TreeMap<String, Integer> map = new java.util.TreeMap<>();
    
    // Adding key-value pairs to the TreeMap
    map.put("Sanjay", 25);
    map.put("Praveen", 30);
    map.put("Anguraja", 28);
    map.put("Suriya", 22);
    
    // Displaying the TreeMap
    System.out.println("TreeMap: " + map);
    
    // Accessing a value by key
    System.out.println("Value for key 'Sanjay': " + map.get("Sanjay"));
    
    // Checking if a key exists
    System.out.println("Contains key 'Praveen': " + map.containsKey("Praveen"));
    
    // Removing a key-value pair
    map.remove("Anguraja");
    System.out.println("After removing 'Anguraja': " + map);
    
    // Iterating through the TreeMap
    for (String key : map.keySet()) {
      System.out.println(key + ": " + map.get(key));
    }
  }
}
