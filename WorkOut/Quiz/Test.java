
class A {
    void print() { System.out.println("A"); }
    void call() { print(); }
}
class B extends A {
    //void print() { System.out.println("B"); }
     void call() { print(); }
}

public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.call();
    }
} 