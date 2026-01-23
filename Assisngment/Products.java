
import java.util.*;

public class Products {
  public static void main(String[] args) {
  
      List<String>Product= new LinkedList<String>();
      Product.add("Laptop");
      Product.add("Mobile");
      Product.add("Charger");
      System.out.println("Laptop is available is  T or F :"+Product.contains("Laptop"));
      Product.set(0,"Adv Laptop");
      System.out.println(Product);
Product.clear();
System.out.println(Product);
  }
}
