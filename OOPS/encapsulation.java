class Emp{
  private int empno;
  private int sal;
  private String name;
  public void setempno(int empno) {
    this.empno = empno;
  }
  public void setsal(int sal) {
    this.sal = sal;
  }
  public void setname(String name) {
    this.name = name;
  } 
  public int getempno() {
    return empno;
  }
  public int getsal(){
      return sal;
  }
    public String name(){
      return name;
  }
  public void display() {
    System.out.println("Employee No: " + empno);
    System.out.println("Employee Name: " + name);
    System.out.println("Employee Salary: " + sal);
  }
}

public class encapsulation {
  public static void main(String[] args) {
    Emp e = new Emp();
    e.setempno(101);
    e.setname("Sanjay");
    e.setsal(50000);
    //e.sal=50000; // This line would cause an error because sal is private and cannot be accessed directly.
    //so that we go with encapsulation to access the private variables through public methods. (secure way)
    // Displaying employee details
    e.display();
    
  }
}
