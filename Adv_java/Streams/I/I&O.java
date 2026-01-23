package Adv_java.Streams.I;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class O {
   public static void main(String[] args) {
       FileInputStream fis = null;
      FileOutputStream fos = null;
      try{
        inStream = new FileInputStream("D:\\java\\Adv_java\\Streams\\source.txt");
        outStream = new FileOutputStream("D:\\java\\Adv_java\\Streams\\dest.txt");
        int content;
        while((content = inStream.read()) != -1){
            outStream.write(content);
        }
      }catch(Exception e){
          System.out.println(e.getMessage());
      }finally{
         try{
             if(inStream != null)
                 inStream.close();
             if(outStream != null)
                outStream.close();
         }catch(IOException ie){
              System.out.println(ie.getMessage());
         }  
      }
    }
}
