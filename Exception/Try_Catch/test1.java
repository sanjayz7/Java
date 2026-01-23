package Exception.Try_Catch;

public class test1 {
 
  public static void main(String[] args) {
     int a[]=new int[5];
    test1 obj = new test1();
    try {
      a[5] = 10; // This will cause an ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught an exception: " + e.getMessage());
    } finally {
      System.out.println("Execution completed.");
    }
  }
}
