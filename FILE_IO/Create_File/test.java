
import java.io.*;
public class test {
 public static void main(String[] args) {
   try{
  
  File file= new File("D:\\java\\FILE_IO\\Create_File/myfile.txt");
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
      }
    }
