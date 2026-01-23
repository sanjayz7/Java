class emp{
  String name;
  int emp_id;
  static String company="Infosys"; // Static variable shared by all instances
  emp(String name, int emp_id) {
    this.name = name;
    this.emp_id = emp_id;
  }
 public  void display() {
    System.out.println("Name: " + name);
    System.out.println("Employee ID: " + emp_id);
    System.out.println("Company: " + company); // Accessing static variable
  }
}


public class static1 {
  public static void main(String[] args) {
    emp emp1 = new emp("Praveen", 101);
    emp emp2 = new emp("Sanjay", 102);
    emp emp3 = new emp("Harish", 103);
    emp emp4 = new emp("Ravi", 104);
    

    emp1.display(); // Displays details for emp1
    emp2.display(); // Displays details for emp2
    emp3.display(); // Displays details for emp3
    emp4.display(); // Displays details for emp4
    // Changing the static variable company
    
    emp.company = "Wipro"; // Changing the static variable company
    System.out.println("\nAfter changing the company name:");
    
    emp1.display(); // Displays updated company name for emp1
    emp2.display(); // Displays updated company name for emp2
        emp3.display(); // Displays details for emp3
    emp4.display(); // Displays details for emp4
  }
}
