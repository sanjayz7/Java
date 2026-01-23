package Recursion;

import java.util.*;
public class Recursion {
 long factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
  public static void main(String[] args) {
   Recursion res = new Recursion();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to calculate its factorial: ");
    int num = sc.nextInt();
    long result = res.factorial(num);
    System.out.println("Factorial of " + num + " is: " + result);
    sc.close();
  }
}
