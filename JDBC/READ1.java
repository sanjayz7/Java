import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class READ1 {
    public static void main(String[] ar) {
        try {
            // 1. Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Kongu", 
                "root", 
                "Sanjayk*1"
            );

            // 2. Create a statement
            Statement statement = con.createStatement();

            // 3. Execute query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student;");

            // 4. Process results
            while(resultSet.next()) {
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                System.out.println(name + " | " + age + " | " + email + " | " + phone);
            }

            // 5. Close resources
            resultSet.close();
            statement.close();
            con.close();

            System.out.println("Connection Established");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
