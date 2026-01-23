package Strings.Method;

public class Trim {
  public static void main(String[] args) {
    String str = "   Hello World!   ";
    
    // Trim leading and trailing whitespace
    String trimmedStr = str.trim();
    
    // Display the result
    System.out.println("Original String: '" + str + "'");
    System.out.println("Trimmed String: '" + trimmedStr + "'");
  } 
}
