import java.util.*;

public class Main{
  public static void main(String[] args) {
   TreeMap<String, Long> map = new TreeMap<>();
map.put("Rohit",9234567890L);
map.put("Sanjay",9736567890L);

map.put("Praveen",9534567890L);
map.put("Kumar",9236567890L);
map.put("Sai",9634567890L);
map.put("Santhosh",9863456780L);
System.out.println(map);

SortedMap<String,Long> sortedContacts= map.subMap("S","Z");
System.out.println(sortedContacts);
  }
}
