
import java.io.*;
public class test {
    public static void main(String a[]){
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\java\\FILE_IO\\BufferReader\\test.java"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
