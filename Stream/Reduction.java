// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> names= Arrays.asList(1,2,3,4,5);
      int sum=  names.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);
     
    }
}