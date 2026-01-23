constructor chaining 
class Parent {
    Parent() {
        System.out.print("P ");
    }
}

class Child extends Parent {
    Child() {
        System.out.print("C ");
    }

    public static void main(String[] args) {
        new Child();
    }
}
