// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> prices= Arrays.asList(100,200,400);
        List<String>book_names=Arrays.asList("Rich Dad Poor Dad","Think and Grow Rich","Atomic Habits");
        
        List<Integer> filteredIndexes=
        IntStream.range(0,book_names.size())
        .filter(i->prices.get(i)>300)
        .boxed()
        .collect(Collectors.toList());
        System.out.println(filteredIndexes);
        
        
        
        //filteredIndexes.stream()
        filteredIndexes.stream()
        .map(i->book_names.get(i).toUpperCase())
        .sorted()
        .forEach(System.out::println);
        
        
        int total= filteredIndexes.stream()
        .map(i->prices.get(i))
        .reduce(0,(a,b)->a+b);
        System.out.println("Total Sales: "+total);
        
        
        
      
    }
}