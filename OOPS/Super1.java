
class A {
  A(int i) {
    System.out.println("A's constructor called with value: " + i);
    System.out.println("This is the base class constructor");
  }
}

class B extends A {
  B() {
    super(5); // ✅ Must be the first statement
    System.out.println("This is the derived class constructor");
  }
}

public class Super1 {
  public static void main(String[] args) {
    B obj = new B();
  }
}
