import java.io.FileWriter;
import java.io.IOException;
public class test {
    public static void main(String a[]){
        try{
           FileWriter writer = new FileWriter("D:\\java\\FILE_IO\\Create_File\\myfile.txt",true);
           writer.write("This is line is appended");
           writer.close();
           System.out.println("Appended Successfully");
        }
        catch(IOException e){
            System.out.println("error");
        }
    }
}
