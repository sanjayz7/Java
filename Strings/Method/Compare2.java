package Strings.Method;

public class Compare2 {
  String str1 = "Hello";
  String str2 = "World";

  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";
    // Using compareTo method
    int result = str1.compareTo(str2);
    // Displaying the result  
    System.out.println("Comparison Result: " + result);
    // Using compareToIgnoreCase method
    String str3 = "hello";
    int resultIgnoreCase = str1.compareToIgnoreCase(str3);
    // Displaying the result  
    System.out.println("Comparison Result (Ignore Case): " + resultIgnoreCase);
    // Using equals method
    boolean isEqual = str1.equals(str2);
    // Displaying the result
    System.out.println("Are strings equal? " + isEqual);
    // Using equalsIgnoreCase method
    boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
    // Displaying the result
    System.out.println("Are strings equal (Ignore Case)? " + isEqualIgnoreCase);
    String r = "kongu";
    String r1 = "Kongu";
    // Using compareTo method with different cases
    int caseResult = r.compareTo(r1);

    // Displaying the result
    System.out.println("Comparison Result with different cases: " + caseResult);
  }
}
