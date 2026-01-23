import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class WRITE1 {
    public static void main(String[] ar) {
        try {
            // 1. Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Kongu", 
                "root", 
                "Sanjayk*1"
            );

            // 2. Create a statement
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter name:");
        String name = sc.nextLine();
         System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
         System.out.println("Enter  email:");
        String email = sc.nextLine();
         System.out.println("Enter phone");
        String phone = sc.nextLine();

            // 4. Process results
           String query = "INSERT INTO studentTable VALUES (?,?,?,?);";
            PreparedStatement queryStatement = con.prepareStatement(query);
            
            queryStatement.setString(1, name);
            queryStatement.setInt(2, age);
            queryStatement.setString(3, email);
            queryStatement.setString(4, phone);
            int rowsInserted = queryStatement.executeUpdate();
            if(rowsInserted > 0) System.out.println("Inserted successfully");
              else System.out.println("Insertion failed");
            queryStatement.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
