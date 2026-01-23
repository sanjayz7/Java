import java.util.*;
import java.lang.reflect.Field;

public class HashMapDemo {
    
    // Custom class to demonstrate hashing
    static class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && Objects.equals(name, person.name);
        }
        
        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== HashMap Internal Working Demo ===\n");
        
        // 1. Basic HashMap Operations
        demonstrateBasicOperations();
        
        // 2. Hash Function and Collision Handling
        demonstrateHashing();
        
        // 3. Performance Analysis
        demonstratePerformance();
        
        // 4. Custom Objects as Keys
        demonstrateCustomKeys();
        
        // 5. HashMap Iteration
        demonstrateIteration();
    }
    
    static void demonstrateBasicOperations() {
        System.out.println("1. BASIC OPERATIONS");
        System.out.println("==================");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        // PUT operation - O(1) average
        System.out.println("Adding elements:");
        map.put("apple", 100);
        map.put("banana", 200);
        map.put("cherry", 300);
        map.put("date", 400);
        
        System.out.println("Map after additions: " + map);
        System.out.println("Size: " + map.size());
        
        // GET operation - O(1) average
        System.out.println("\nRetrieving elements:");
        System.out.println("apple = " + map.get("apple"));
        System.out.println("grape = " + map.get("grape")); // null
        
        // UPDATE operation
        System.out.println("\nUpdating existing key:");
        Integer oldValue = map.put("apple", 150);
        System.out.println("Old value of apple: " + oldValue);
        System.out.println("New value of apple: " + map.get("apple"));
        
        // REMOVE operation - O(1) average
        System.out.println("\nRemoving element:");
        Integer removedValue = map.remove("banana");
        System.out.println("Removed value: " + removedValue);
        System.out.println("Map after removal: " + map);
        
        // CHECK operations
        System.out.println("\nCheck operations:");
        System.out.println("Contains key 'apple': " + map.containsKey("apple"));
        System.out.println("Contains value 300: " + map.containsValue(300));
        System.out.println("Is empty: " + map.isEmpty());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    static void demonstrateHashing() {
        System.out.println("2. HASH FUNCTION & COLLISION HANDLING");
        System.out.println("=====================================");
        
        HashMap<String, String> map = new HashMap<>(4); // Small initial capacity
        
        String[] keys = {"a", "b", "c", "d", "e", "f", "g", "h"};
        
        System.out.println("Demonstrating hash codes and potential collisions:");
        for (String key : keys) {
            int hashCode = key.hashCode();
            int bucketIndex = hashCode & (4 - 1); // Simulate internal hashing
            
            map.put(key, "Value-" + key);
            
            System.out.printf("Key: '%s' | HashCode: %d | Bucket Index: %d%n", 
                            key, hashCode, bucketIndex);
        }
        
        System.out.println("\nMap contents: " + map);
        
        // Demonstrate collision with intentionally poor hash function
        System.out.println("\nDemonstrating collision handling:");
        HashMap<CollisionKey, String> collisionMap = new HashMap<>();
        
        collisionMap.put(new CollisionKey("key1"), "value1");
        collisionMap.put(new CollisionKey("key2"), "value2");
        collisionMap.put(new CollisionKey("key3"), "value3");
        
        System.out.println("All keys have same hash code but different values:");
        for (Map.Entry<CollisionKey, String> entry : collisionMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    // Helper class for collision demo
    static class CollisionKey {
        String value;
        
        CollisionKey(String value) {
            this.value = value;
        }
        
        @Override
        public int hashCode() {
            return 42; // Intentionally same hash code for all instances
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CollisionKey that = (CollisionKey) obj;
            return Objects.equals(value, that.value);
        }
        
        @Override
        public String toString() {
            return "CollisionKey{" + value + "}";
        }
    }
    
    static void demonstratePerformance() {
        System.out.println("3. PERFORMANCE ANALYSIS");
        System.out.println("=======================");
        
        HashMap<Integer, String> map = new HashMap<>();
        
        // Measure insertion time
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            map.put(i, "Value" + i);
        }
        long insertionTime = System.nanoTime() - startTime;
        
        // Measure retrieval time
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            map.get(i);
        }
        long retrievalTime = System.nanoTime() - startTime;
        
        System.out.printf("Insertion of 100,000 elements: %.2f ms%n", 
                         insertionTime / 1_000_000.0);
        System.out.printf("Retrieval of 100,000 elements: %.2f ms%n", 
                         retrievalTime / 1_000_000.0);
        System.out.println("Final map size: " + map.size());
        
        // Demonstrate load factor impact
        System.out.println("\nLoad Factor Impact:");
        HashMap<Integer, String> smallMap = new HashMap<>(2, 0.75f);
        System.out.println("Initial capacity: 2, Load factor: 0.75");
        
        for (int i = 1; i <= 5; i++) {
            smallMap.put(i, "Value" + i);
            System.out.printf("Added element %d, Size: %d%n", i, smallMap.size());
        }
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    static void demonstrateCustomKeys() {
        System.out.println("4. CUSTOM OBJECTS AS KEYS");
        System.out.println("=========================");
        
        HashMap<Person, String> personMap = new HashMap<>();
        
        Person john = new Person("John", 25);
        Person jane = new Person("Jane", 30);
        Person johnCopy = new Person("John", 25); // Same as john
        
        personMap.put(john, "Software Engineer");
        personMap.put(jane, "Data Scientist");
        
        System.out.println("Added persons to map:");
        System.out.println("John -> " + personMap.get(john));
        System.out.println("Jane -> " + personMap.get(jane));
        
        // Test equality
        System.out.println("\nTesting key equality:");
        System.out.println("john.equals(johnCopy): " + john.equals(johnCopy));
        System.out.println("john.hashCode(): " + john.hashCode());
        System.out.println("johnCopy.hashCode(): " + johnCopy.hashCode());
        
        // Retrieve using equivalent object
        System.out.println("Get using johnCopy: " + personMap.get(johnCopy));
        
        // Show what happens with poor hashCode implementation
        System.out.println("\nBad Practice - Mutable Key Demo:");
        Person mutableKey = new Person("Mutable", 40);
        personMap.put(mutableKey, "Manager");
        System.out.println("Added mutable key: " + personMap.get(mutableKey));
        
        // Modifying the key (BAD PRACTICE!)
        mutableKey.name = "Modified";
        System.out.println("After modifying key: " + personMap.get(mutableKey));
        System.out.println("Warning: Key was modified, breaking HashMap contract!");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    static void demonstrateIteration() {
        System.out.println("5. ITERATION METHODS");
        System.out.println("===================");
        
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 92);
        scores.put("Diana", 98);
        
        System.out.println("Original map: " + scores);
        
        // Method 1: Using entrySet() - Most efficient
        System.out.println("\n1. Using entrySet() [RECOMMENDED]:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }
        
        // Method 2: Using keySet()
        System.out.println("\n2. Using keySet():");
        for (String name : scores.keySet()) {
            System.out.println(name + " scored " + scores.get(name));
        }
        
        // Method 3: Using values()
        System.out.println("\n3. Using values():");
        System.out.print("All scores: ");
        for (Integer score : scores.values()) {
            System.out.print(score + " ");
        }
        System.out.println();
        
        // Method 4: Using forEach (Java 8+)
        System.out.println("\n4. Using forEach with lambda:");
        scores.forEach((name, score) -> 
            System.out.println(name + " -> " + score));
        
        // Method 5: Using streams for processing
        System.out.println("\n5. Using streams for processing:");
        double averageScore = scores.values().stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        
        System.out.printf("Average score: %.2f%n", averageScore);
        
        // Find highest scorer
        String topScorer = scores.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("None");
        
        System.out.println("Top scorer: " + topScorer);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}