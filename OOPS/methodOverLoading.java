class Area{
  void area(){
    System.err.println("no argument is passed");
  }
    void area(int r){
    System.out.println("Area of the Circle: "+(r*r*3.14));
  }
  void area(int l,int b){
    System.out.println("Area of the Rectangle: "+(l*b));
  }
  public int  multiply(){
    return 0;
  }
 public int  multiply(double a,int b){
    return (int) (a * b);
  }
   public int  multiply(int a,double b){
    return (int)(a * b);
  }
  public int  multiply(double a,double b){
    return (int)(a * b);
  }
 public int  multiply(int a,int b){
    return a*b;
  }
}

public class methodOverLoading {
  public static void main(String[] args) {
      
    Area a = new Area();
    a.area();
    a.area(4);
    a.area(3,3);
    System.out.println(a.multiply());
     System.out.println(a.multiply(3,2));
      System.out.println(a.multiply(3,4.4));
       System.out.println(a.multiply(3.5,5));
System.out.println(a.multiply(3.5,6.5));
   
//Error:
//    System.out.println(a.multiply(3.5,6.5,7)); // This will cause an error because there is no such method defined.
//    System.out.println(a.multiply(3,6,9,7)); // This will cause an error because there is no such method defined.
    // The method overloading is done based on the number of parameters and their types.
    // If the method signature does not match any of the defined methods, it will result in a compilation error.
  }
}
