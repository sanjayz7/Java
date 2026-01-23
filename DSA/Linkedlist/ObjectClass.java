class Laptop{
  String brand;
  String model;
  int ram;
  public String toString() {
    return "Laptop{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", ram=" + ram +
            '}';
  }
}

public class ObjectClass {
  public static void main(String[] args) {
    Laptop laptop = new Laptop();
    laptop.brand = "Dell";
    laptop.model = "XPS 13";
    laptop.ram = 16;
 //toString- object class method
  //It returns a string representation of the object
  //It is used to print the object in a readable format
  //It is called automatically when we print the object
    //or when we concatenate the object with a string
    System.out.println(laptop);
  } 
}
