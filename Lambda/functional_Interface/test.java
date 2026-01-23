
@FunctionalInterface
interface Greeting {
    void sayHello();
}
public class LambdaExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the sayHello method
        Greeting greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();
        //The body (System.out.println("Hello, World!")) is executed when sayHello() is called.
    }
  
}
