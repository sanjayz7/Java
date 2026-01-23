// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Map<String,Integer> ans = new HashMap<>();
        ans.put("Sanjay",100);
         ans.put("Rahul",80);
          ans.put("Sujith",90);
          System.out.println(ans.get("Sanjay"));
          ans.forEach((k,v)->System.out.println(k + " : "+v));
        System.out.println(ans.getOrDefault("Kumar",50));
        
    }
}