package Strings.Method;

public class Split {
  public static void main(String[] args) {
      String str1="Kongu College is number one in Perundurai";
      String str2 [] = str1.split(" ");
     
      System.out.println("Original String: " + str1);
      System.out.println("Split String:");
      for(String obj:str2){
        System.out.println(obj);
      }
  }
}
