import java.time.LocalTime;
public class test1 {
  public static void main(String[] args) {
    
  
  LocalTime now = LocalTime.now();
  System.out.println("Current Time: " + now);
  System.out.println("Hour: " + now.getHour());
  System.out.println("Minute: " + now.getMinute());
  
}

}