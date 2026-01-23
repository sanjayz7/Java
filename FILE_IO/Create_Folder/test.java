

import java.io.File;

public class test {
  public static void main(String[] args) {
      
  
  File folder= new File("My folder");
  if(!folder.exists()){
    boolean created =folder.mkdir();
    if(created){
      System.out.println("Folder created");
    }
    else{
      System.out.println("Folder not created");
    }
  }
  else{
    System.out.println("Folder already exists");
  }

}
}
