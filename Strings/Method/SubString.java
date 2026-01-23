package Strings.Method;

public class SubString {
  public static void main(String[] args) {
      String str = "Hello, World!";
      // Extracting a substring from index 7 to the end
      String subStr1 = str.substring(7);


      // Extracting a substring from index 0 to 5
      String subStr2 = str.substring(0, 5);
      // Displaying the substrings
      System.out.println("Substring from index 7: " + subStr1);
      System.out.println("Substring from index 0 to 5: " + subStr2);
      // Using substring to extract a part of the string  
      String str2 = "Java Programming";
      String subStr3 = str2.substring(5, 16); // Extracting "Programming"
  }
}
