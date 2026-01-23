package Recursion;

public class R1 {
  public static void print(int n) {
  System.out.print(print(n-1))
  }

  public static void main(String[] args) {
    print(200)
  }
}
