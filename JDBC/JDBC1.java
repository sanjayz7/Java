import java.sql.Connection;
import java.sql.DriverManager;
public class  JDBC1 {
  public static void main(String[] ar)
{
try{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kongu", "root", "Sanjayk*1");


System.out.println("Connection Established");
con.close();
}
catch(Exception e){
e.printStackTrace();
}
}
}


