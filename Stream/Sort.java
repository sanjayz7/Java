package Stream;

public class Sort {
  public static void main(String[] args) {
      List<String> names= Arrays.asList("John","Jane","Kumar");
      names.stream().sorted().forEach(System.out::println);
  }
}
