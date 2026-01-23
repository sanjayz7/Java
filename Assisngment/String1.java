// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class String1{
    public static void main(String[] args) {
        String s = "sanjay";
      char arr[] = new char[26];
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            String k = String.valueOf(arr);
           System.out.println(k);
    }
}