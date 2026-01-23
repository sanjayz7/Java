import java.util.Scanner;

public class Recursion1 {

    public static void d2b(int n) {
        if (n == 0) {
            return;
        }
        d2b(n / 2);          // recursive call
        System.out.print(n % 2);  // print after recursion
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number to convert to binary: ");
        int n = sc.nextInt();

        System.out.print("Binary representation of " + n + " is: ");
        if (n == 0) {
            System.out.print(0);
        } else {
            d2b(n);
        }
    }
}
