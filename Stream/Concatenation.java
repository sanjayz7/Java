package Stream;

import java.util.stream.Stream;

public class Concatenation {
  public static void main(String[] args) {
      Stream<String> stream1 = Stream.of("A", "B", "C");
      Stream<String> stream2 = Stream.of("D", "E", "F");
      Stream.concat(stream1,stream2)
      .forEach(System.out::println);      
  }
}
