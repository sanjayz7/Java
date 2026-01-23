package Strings.Method.Concat;

public class test {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "World";
    
    // Using concat method
    String result = str1.concat(str2);
    
    // Displaying the result
    System.out.println("Concatenated String: " + result);
    
    // Using + operator for concatenation
    String result2 = str1 + " " + str2;
    
    // Displaying the result
    System.out.println("Concatenated String using +: " + result2);
  }
}
