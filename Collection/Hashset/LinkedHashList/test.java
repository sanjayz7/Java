package Collection.Hashset.LinkedHashList;

public class test {
  public static void main(String[] args) {
      HashSet h = new HashSet();
      LinkedHashSet l = new LinkedHashSet();
      h.add("Sanjay");
      h.add("Praveen");
      h.add("Anguraja");
      h.add("Suriya");
      System.out.println(h);
      l.add("Sanjay");
      l.add("Praveen");
      l.add("Anguraja");
      l.addAll(h);
      
  }
}
