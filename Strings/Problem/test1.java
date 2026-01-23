package Strings.Problem;

import java.util.*;
public class test1 {
 public static void main(String[] args) {
     String str = "Kongu College is number one in Perundurai";
      char[] charArray = str.toCharArray();
      // Sort the character array
      System.out.println("Original String: " + str);
      Arrays.sort(charArray);
      
       System.out.println("Sorted Characters: " + new String(charArray));
 } 
}
//Write program to sort  all the characters of given string in ascending order.
//Write program to sort  all the characters of given string in ascending order.