// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    int  roll;
    String name;
    public void getData(){
        System.out.println("Enter the roll number: ");
    roll = sc.nextInt();
    name = sc.next();
    }
    public void showData(){
        System.out.println("The Rollno is :"+roll+" and  Name :"+name);
        
    }
}
class Mark extends Student{
    
 int maths,phy,che;
 void getMarks(){
     System.out.println("Enter the marks:");
     maths=sc.nextInt();
     phy=sc.nextInt();
     che=sc.nextInt();
 }
 void showMarks(){
     System.out.println("Maths mark:"+maths+"Chemistry mark:"+che+"Physics marks:"+phy);
 }
    
}
class Avg extends Mark{
    void display(){
    System.out.println("Avg of the rollno:"+roll +" Average Mark of the student :"+(maths+phy+che)/3);
    System.out.println("Total of the given marks:"+(maths+phy+che));
    }
}
class Main {
    public static void main(String[] args) {
        Avg a = new Avg ();
        a.getData();
        a.showData();
        a.getMarks();
        a.showMarks();
        a.display();
    }
}