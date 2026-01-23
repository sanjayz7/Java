class baseclass{
  final void display(){
    System.out.println("This is the base class method");
  }
}
class derivedclass extends baseclass{
  // Cannot override the final method from baseclass
  void display() { 
     System.out.println("This is the derived class method");
  }
}
public class final2 {
  public static void main(String[] args) {
      derivedclass obj2 = new derivedclass();
      obj2.display(); // Calls the overridden method in derivedclass
  }
}
