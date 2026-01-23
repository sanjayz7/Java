class student{
  int rno;
  String name;
  int dept_no;
  String dept_name;
  student(int rno,String name,String dept_name,int dept_no){
    this.dept_no=dept_no;
    this.dept_name=dept_name;
    this.name=name;
    this.rno=rno;
  }
  student(student s1){//Copy Constructor{
this.dept_name=s1.dept_name;
this.dept_no=s1.dept_no;  
}
public void display(){
  System.out.println("Rollno:"+rno);
System.out.println("Name:"+name);
System.out.println("Dept_name:"+dept_name);
System.out.println("Dept_no:"+dept_no);
} 
}

public class Copy_Constructor {
  public static void main(String[] args) {
      student s1 = new student(101,"Sanjay","IT",1);
      student s2 =  new student(s1);
      s2.name = "Praveen";
      s2.rno=102;
      s1.display();
      s2.display();
  }
}
