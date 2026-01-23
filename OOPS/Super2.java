
class  baseclass{
    int a =3;
    public void display(){
        System.out.println("This is the base class method");
    }
}
class derivedclass extends baseclass{
    int a=2; // This variable hides the variable in baseclass
    @Override
    public void display(){
        System.out.println("This is the derived class method");
super.display(); // Calls the method in baseclass using super
System.out.println(a);
        System.out.println(super.a); // Accesses the variable in baseclass using super

    }
}
public class Super2 {
public static void main(String[] args) {
   derivedclass obj2 = new derivedclass();
   obj2.display(); // Calls the overridden method in derivedclass
}

}

    