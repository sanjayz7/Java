package Project1.Student_Detail;
import java.sql.*;
import java.util.*;
public class Student {
    static final String URL ="jdbc:mysql://localhost:3306/kongu";
    static final String root ="root";
    static final String password
    ="Sanjayk*1";
    public static void add(String name, int age,String phone){
        String query="INSERT INTO Students(name,age,phone) VALUES(?,?,?)";

        try{
            Connection con = DriverManager.getConnection(URL,root,password);
            PreparedStatement pst=con.prepareStatement(query);

                pst.setString(1,name);
                pst.setInt(2,age);
                pst.setString(3,phone);
                pst.executeUpdate();
                System.out.println("Student Added Successfully");


        }
	catch(Exception e){
                System.out.println("Exception is Occured");

            }

        }
        public static void view(){
            String query="SELECT * FROM Students";
            try{
                Connection con =DriverManager.getConnection(URL,root,password);
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery(query);
                System.out.println("Student Records");
                while(rs.next()){
                    System.out.println("Name : "+rs.getString("name")+" Age : "+rs.getInt("age")+" Phone : "+rs.getString("phone"));
                }
            }
                catch(Exception e){

                    System.out.println("Exception");
                }

        }
        public static void  update(String name,String phone){
            String query ="UPDATE Students SET phone=? WHERE name=?";
            try {
                Connection con = DriverManager.getConnection(URL, root, password);
                PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, phone);
                    pst.setString(2, name);
                    int rows = pst.executeUpdate();
                    if (rows > 0) {
                        System.out.println("Updated Data");
                    } else {
                        System.out.println("No rows are there to update");
                    }

            }

            catch(Exception e){

                System.out.println("Exception");
            }
        }
        public static void delete(String name) {
            String query = "DELETE FROM Students WHERE name=?";
            try {
                Connection con = DriverManager.getConnection(URL, root, password);
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, name);
                int rows = pst.executeUpdate();
                if (rows > 0) {
                    System.out.println("Updated Data");
                } else {
                    System.out.println("No rows are there to update");
                }
            } catch (Exception e) {

                System.out.println("Exception");
            }
        }

        public static void main(String[] args) throws SQLException {
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("\n---Student Details---");
                System.out.println("1. Add Student");
                System.out.println("2. Update Student Phone");
                System.out.println("3. Delete Student");
                System.out.println("4. View Students");
                System.out.println("5. Quit");

                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Enter Name:");
                        String  name=sc.next();

                        System.out.print("Enter Age:");
                        int age=sc.nextInt();

                        System.out.print("Enter Phone:");
                        String phone=sc.next();

                        add(name,age,phone);
                        break;
                    case 2:
                        System.out.print("Enter Name:");
                        name=sc.next();


                        System.out.print("Enter New Phone:");
                       phone=sc.next();

                        update(name,phone);
                        break;
                    case 3:
                        System.out.print("Enter Name:");
                        name=sc.next();



                        delete(name);
                        break;
                    case 4:
                        view();
                        break;
                    case 5:
                        System.out.println("Exit");
                        System.exit(0);
                        break;

                }
            }
        }

    }
