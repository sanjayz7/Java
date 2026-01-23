package Exception.Try_Catch;

public class test3 {
  public static void main(String[] args) {
    String str = "Hello, World!";
    try {
      // Attempt to access a character at an invalid index
      char ch = str.charAt(20); // This will cause a StringIndexOutOfBoundsException
      System.out.println("Character at index 20: " + ch);
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
    } finally {
      System.out.println("This block always executes, regardless of an exception.");
    }
  }
}
