

import java.io.*;

public class test {
  
    public static void main(String a[]){
        try{
            FileWriter writer = new FileWriter("D:\\java\\FILE_IO\\Create_File\\myfile.txt");
            writer.write("Hello,this is a sample text written to the file.\n");
            writer.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred");
            
    }
}
}
