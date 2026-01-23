import java.time.ZonedDateTime;
import java.time.ZoneId;
public class Main{
    public static void main(String a[]){
        ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZoneId zone =ZoneId.systemDefault();
        System.out.println("Current Time Zone: "+zone);
        
        System.out.println("India Time :"+india);
    }
}