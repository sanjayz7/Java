import java.util.*;
public class Number1{
    
public static void main(String a[]){
    try{
    String s="abc";
    int n=Integer.parseInt(s);
    System.out.println(n);
}
catch(NumberFormatException e){
    System.out.print(e.getMessage()+" Error");
}}
}