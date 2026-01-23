package Strings.Method;

public class Replace {
  public static void main(String[] args) {
    String str = "Hello World";
    
    // Replace 'World' with 'Java'
    String replacedStr = str.replace("World", "Java");
    
    // Display the result
    System.out.println("Original String: " + str);
    System.out.println("Replaced String: " + replacedStr);
  }
}
