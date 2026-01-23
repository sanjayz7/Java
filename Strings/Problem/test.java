import java.util.*;
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
