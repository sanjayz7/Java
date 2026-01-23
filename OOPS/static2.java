class emp{
  static String company = "Infosys"; // Static variable shared by all instances
 static String name="Sanjay";
  static int emp_id=101;
  static void display() {
    System.out.println("Company: " + company); // Accessing static variable
System.out.println("Emp_name: " + name); 
System.out.println("Emp_id: " +emp_id); 

  }

}

public class static2 {
  public static void main(String[] args) {
      emp.display();
  }
}
