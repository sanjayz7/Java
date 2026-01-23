package Exception.Try_Catch;

public class test2 {
  public static void main(String[] args) {
      String s = null;
      try {
          System.out.println(s.length()); // This will cause a NullPointerException
      } catch (NullPointerException e) {
          System.out.println("Caught a NullPointerException: " + e.getMessage());
      } finally {
          System.out.println("This block always executes, regardless of an exception.");
      }
  }
}
