package Strings.Method;
//Using indexOf() method to find the index of a character in a string
// and lastIndexOf() method to find the last occurrence of a substring.
public class IndexOf {
  public static void main(String[] args) {
      String str1 = "Hello, World! is Words";
      char ch = 'W';
      int index = str1.indexOf(ch);
      // Displaying the index of the character
      System.out.println("Index of '" + ch + "': " + index);
      int index2 = str1.lastIndexOf("Words");
      System.out.println("Index of '" + ch + "': " + index);
  

}
}