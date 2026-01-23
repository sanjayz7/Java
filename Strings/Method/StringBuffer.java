public class StringBuffer {
  public static void main(String[] args) {
    String a =" Erode";
      StringBuffer sb = new StringBuffer("Kongu College");
      sb.append(a);
      System.out.println(sb);
      String b="The ";
      sb.insert(0,b);
      System.out.println(sb);
      sb.deleteCharAt(3);
      System.out.println(sb);
                  
  }


}
/*
 * package Strings.Method;

public class StringBuffer {
  public static void main(String[] args) {
    // Create a StringBuffer object
    StringBuffer sb = new StringBuffer("Hello");

    // Append text to the StringBuffer
    sb.append(" World");

    // Display the content of the StringBuffer
    System.out.println("StringBuffer Content: " + sb.toString());

    // Insert text at a specific position
    sb.insert(5, ",");
    System.out.println("After Insertion: " + sb.toString());

    // Reverse the content of the StringBuffer
    sb.reverse();
    System.out.println("Reversed Content: " + sb.toString());
  }
}

 */