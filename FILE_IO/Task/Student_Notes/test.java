
import java.io.*;
public class test {
 public static void main(String[] args) throws IOException {
   try{
  
  File file= new File("D:\\java\\FILE_IO\\Task\\Student_Notes\\java/Chapter1.txt");
  if(file.createNewFile()){
    System.out.println("File created: "+file.getName());
  
    }
    else{
      System.out.println("File already exists");
    }
    }
    catch(Exception e){
      System.out.println("An error occurred");
      e.printStackTrace();
    }
      
           FileWriter writer = new FileWriter("D:\\java\\FILE_IO\\Task\\Student_Notes\\java/Chapter1.txt",true);
           writer.write("This is line is appended");
           writer.close();
           System.out.println("Appended Successfully");
        

      }
    }
