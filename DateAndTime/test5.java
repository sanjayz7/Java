import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String a[]){
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
      DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("E,MMM dd yyyy");
      System.out.println("Format 1:"+now.format(fmt1));
      System.out.println("Format 1:"+now.format(fmt2));
      String dateStr="15/08/2025 10:30:00";
      LocalDateTime parsed =LocalDateTime.parse(dateStr,fmt1);
      System.out.println("Parsed Date:"+parsed);
      
    }
} 