// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Account {
    int acc_no;
    String acc_name;
Scanner sc = new Scanner(System.in);
    void getAccountName(){
        System.out.print("Enter the account_no :");
        acc_no=sc.nextInt();
          System.out.print("Enter the account_name:");
        acc_name = sc.next();
    }
    void showData(){
        System.out.println("Account number :"+acc_no);
            System.out.println("Account name :"+acc_name);
        
    }
}
            
class saving extends Account{
    int bal;
    public void  getAccount(){
        System.out.print("Enter the balance:");
        bal = sc.nextInt();
        if(bal>1000){
            System.out.println("Account is created");
        }
        else{ System.out.println("Account is not created");
            
        }
    }
    
}
class current extends Account{
      int bal;
    public void getAccount(){
        System.out.println("Enter the balance:");
        bal = sc.nextInt();
        if(bal>5000){
            System.out.println("Account is created");
        }
        else{ System.out.println("Account is not created ,Minimum balance is required");
            
        }
    }
}
public class Main {
    public static void main(String a[]){
            Scanner sc = new Scanner(System.in);
        System.out.println("1:Saving Account");
         System.out.println("2:Current Account");
          System.out.print("Enter the choice of Account:");
        int type = sc.nextInt();
        switch(type){
        case 1:
            saving s = new saving();
            s.getAccountName();
            s.showData();
            s.getAccount();
            break;
        case 2:
            current c = new current();
            c.getAccountName();
            c.showData();
            c.getAccount();
            break;
        default:
            System.out.println("Enter valid number either 1 or 2");
        }
    }
}



2)


import java.util.*;

class Department {
    Department() {
        System.out.println("Department class constructor");
    }
}

class It extends Department {
    It() {
        System.out.println("it class constructor");
    }
}

class ss extends Department {
    ss() {
        System.out.println("ss class constructor");
    }
}

class sectionA extends It {
    sectionA() {
        System.out.println("A class constructor");
    }
}

class sectionB extends ss {
    sectionB() {
        System.out.println("B class constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        sectionA a = new sectionA();
        sectionB b = new sectionB();
    }
}
