import java.lang.*;
/**
 * This class demonstrates the use of StringBuilder in Java.
 * StringBuilder is used for creating mutable strings, which can be modified without creating new objects.
 */
public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("World!");
        System.out.println(sb.toString());
        
        // Example of using StringBuilder in a loop
        for (int i = 0; i < 5; i++) {
            sb.append(" Number ").append(i);
        }
        System.out.println(sb.toString());
    }
}
/*
 * import java.util.*;
public class StringBuilder {
  public static void main(String[] args) {
    StringBuffer a = new StringBuffer(" Erode");
 System.out.print(a.reverse());
 String b = "Erode";
 char c [] = b.toCharArray();
 for(int i =b.length()-1;i>=0;i--){
     System.out.print(c[i]);
 }
 System.out.print(" ");
 for(int i=b.length()-1;i>=0;i--){
     System.out.print(b.charAt(i));
 }
  }


}

 */