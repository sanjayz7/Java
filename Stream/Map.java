package Stream;

import com.sun.tools.javac.Main;

public class Map {
  public static void main(String[] args) {
      List<String> names= Arrays.asList("John","Jane","Kumar");
      names.stream().map(String::toUpperCase).forEach(System.out::println);

  }
}
