package Lambda.functional_Interface;
interface MathOperation {
    int operation(int a, int b);
}
public class test2 {
  public static void main(String[] args) {
    MathOperation add = (a,b)-> a+b;
    MathOperation sub = (a,b)-> a-b;
    System.out.println("Addition: "+add.operation(2,10));
    System.out.println("Subtraction: "+sub.operation(10,2));
  }

  
}
