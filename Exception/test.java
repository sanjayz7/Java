package Exception;

public class test {

  void check(int age){
        if(age<18){
          throw new ArithmeticException("Age must be 18 or older");
        } else {
          System.out.println("Age is valid: " + age);
        }
      }  public static void main(String[] args) {
      test obj = new test();
      try {
          obj.check(16); // This will throw an exception
      } catch (ArithmeticException e) {
          System.out.println("Caught an exception: " + e.getMessage());
      } finally {
          System.out.println("Execution completed.");
      }
  }
}
