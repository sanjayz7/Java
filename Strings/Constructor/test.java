public class test {
    public static void main(String a[]){
  String s1 = new String("Sanjay");
  String s2 = new String("Sanjay");
String s3 = "Sanjay";
String s4 ="Sanjay";
 System.out.println(s1 == s2); // false, because they are different objects in memory
 System.out.println(s3==s4);
 
 String str1="Kongu";
 System.out.println(str1);
 str1 = "KEC";
 System.out.print(str1);
}
}