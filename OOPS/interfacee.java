interface Shape{
    void area();
}
class Circle implements Shape{
    int r =2;
   public void area(){
        System.out.println("Area :"+r*r*3.14);
    }
}
public class interfacee {
    public static void main(String[] args) {
        Shape c = new Circle();//reference 
        c.area();
    }
}