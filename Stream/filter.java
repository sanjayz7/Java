// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("John","Jane","Kumar");
        names.stream().filter(n->n.startsWith("J")).forEach(System.out::println);
     
    }
}