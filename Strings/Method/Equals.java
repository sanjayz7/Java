public class Equals {
    public static void main(String[] args) {
        String str1 = "Sanjay";
        String str2 = "Sanjay";
        String str3 = new String("Sanjay");
        
        // Using equals() method to compare strings
        System.out.println("Using equals(): " + str1.equals(str2)); // true
        System.out.println("Using equals(): " + str1.equals(str3)); // true
        
        // Using == operator to compare references
        System.out.println("Using == operator: " + (str1 == str2)); // true, same reference
        System.out.println("Using == operator: " + (str1 == str3)); // false, different references
        
        // Comparing with null
        String str4 = null;
        System.out.println("Comparing with null: " + str1.equals(str4)); // false
    }
}