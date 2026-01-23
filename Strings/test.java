package Strings;

public class test {
  public static void main(String[] args) {
      Byte[] b = new byte[10];
      b[0] = 65; // ASCII value for 'A' 
      b[1] = 66; // ASCII value for 'B'
      b[2] = 67; // ASCII value for 'C' 
      b[3] = 68; // ASCII value for 'D'
      String s = new String(b);
      System.out.println(s); // Output: ABCD
      String s1 = "Sanjay";
      String s2 = "Sanjay";
      System.out.println(s1 == s2); // true, because both refer to the same string literal in the string pool
      String s3 = new String("Sanjay");
      String s4 = new String("Sanjay");
      System.out.println(s3 == s4); // false, because they are different objects in memory
      System.out.println(s1.equals(s2)); // true, because the content is the same
      System.out.println(s3.equals(s4)); // true, because the content is the same
      System.out.println(s1.equals(s3)); // true, because the content is the same
      System.out.println(s1.compareTo(s2)); // 0, because both strings are equal
      System.out.println(s1.compareTo(s3)); // 0, because both strings are equal
      System.out.println(s1.compareTo("Sanjay Kumar")); // negative value, because "Sanjay" is lexicographically less than "Sanjay Kumar"

      System.out.println(s1.length()); // 6, because "Sanjay" has 6 characters
      System.out.println(s1.charAt(0)); // 'S', because it returns the character at index 0
      System.out.println(s1.indexOf('a')); // 2, because 'a' is at index 2 in "Sanjay"
      System.out.println(s1.lastIndexOf('a')); // 4, because the last 'a' is at index 4 in "Sanjay"
      System.out.println(s1.substring(0, 3)); // "San", because it returns the substring from index 0 to 3 (exclusive)
      System.out.println(s1.toUpperCase()); // "SANJAY", because it converts the string to uppercase
      System.out.println(s1.toLowerCase()); // "sanjay", because it converts the string to lowercase
      System.out.println(s1.replace('a', 'o')); // "Sonjoy", because it replaces 'a' with 'o'
      System.out.println(s1.contains("anj")); // true, because "Sanjay" contains "anj"
      System.out.println(s1.startsWith("San")); // true, because "Sanjay" starts with "San"
      System.out.println(s1.endsWith("jay")); // true, because "Sanjay" ends with "jay"
      System.out.println(s1.split("a").length); // 2, because "Sanjay" splits into ["S", "njay"] when split by 'a'
      System.out.println(s1.trim()); // "Sanjay", because it removes leading and trailing whitespace (none in this case)
      System.out.println(s1.isEmpty()); // false, because "Sanjay" is not empty
      System.out.println(s1.equalsIgnoreCase("sanjay")); // true, because it ignores case differences
      System.out.println(s1.compareToIgnoreCase("sanjay")); // 0, because it ignores case differences and both strings are equal
      System.out.println(s1.concat(" Kumar")); // "Sanjay Kumar", because it concatenates " Kumar" to "Sanjay"
      System.out.println(s1.valueOf(123)); // "123", because it converts the integer 123 to a string
      System.out.println(s1.valueOf(123.45)); // "123.45", because it converts the double 123.45 to a string
      System.out.println(s1.valueOf(true)); // "true", because it converts the boolean true to a string
      System.out.println(s1.valueOf('A')); // "A", because it converts the character 'A' to a string
      System.out.println(s1.valueOf(new char[]{'H', 'e', 'l', 'l', 'o'})); // "Hello", because it converts the character array to a string
      System.out.println(s1.valueOf(new int[]{1, 2, 3})); // "123", because it converts the integer array to a string
      System.out.println(s1.valueOf(new double[]{1.1, 2.2, 3.3})); // "

      
  }
}
