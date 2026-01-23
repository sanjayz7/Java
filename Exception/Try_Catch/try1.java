package Exception.Try_Catch;

public class try1 {
  public static void main(String[] args) {
      try {
        int a=10/0; // This will cause an ArithmeticException
        System.out.println("This line will not be executed due to the exception.");
          
      } catch (ArithmeticException e) {
        System.out.println("An ArithmeticException occurred: " + e.getMessage());
      } finally {
        System.out.println("This block always executes, regardless of an exception.");
      }
  }
}
