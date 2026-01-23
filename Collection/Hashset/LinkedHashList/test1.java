package LinkedHashList;

public class test1 {

    public static void main(String[] args) {
        HashSet<String,Intef> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  // Duplicate, will not be added

        // Print size
        System.out.println("Size: " + fruits.size());

        // Check if it contains an element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Remove an element
        fruits.remove("Banana");

        // Iterate through the set
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("Is empty? " + fruits.isEmpty());
    }
}

