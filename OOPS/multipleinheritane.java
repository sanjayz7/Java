/*public class multipleinheritane {
    interface Shape {
        void area();
    }

    interface Color {
        void fill();
    }

    class Circle implements Shape, Color {
        int r = 2;

        public void area() {
            System.out.println("Area: " + r * r * 3.14);
        }

        public void fill() {
            System.out.println("Filling the circle with color.");
        }
    }

    public static void main(String[] args) {
        Circle c = new multipleinheritane().new Circle(); // reference
        c.area();
        c.fill();
    } 
}
*/

interface A{
  int x =10;
  void display();
}
interface B{
  int x =20;
  void display();
}
class Child implements A,B{
  public void display(){
    System.out.println("Sum :"+(A.x+B.x));
    System.out.println("x in interface A:"+A.x);
       System.out.println("x in interface B:"+B.x);
  }
  
}
public class multipleinheritane{
  public static void main(String[] args) {
    Child c = new Child();
    c.display();
  }
}