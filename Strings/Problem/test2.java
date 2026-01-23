import java.util.*;

public class test2 {
  public static void main(String[] args) {
      String s ="Kongu College";
char[] ch=s.toCharArray();
      StringBuilder result = new StringBuilder();
      StringBuilder result1 = new StringBuilder();
      for(int i=0;i<s.length();i++){
          boolean flag = false;
        for(int j=i+1;j<s.length();j++){
          if(ch[i]==ch[j]){
              flag = true;
            break;
            
          }
        }
          if(flag ==false)
            result.append(ch[i]);
            
          }
          System.out.print(result);
          int index=0;
          for(int i=0;i<ch.length;i++){
              char ch1 = s.charAt(i);
              
              index=s.indexOf(ch1,i+1);
              if(index==-1)
              result1.append(ch1);
          }
          System.out.println();
          System.out.print("Result1:"+result1);
        }
      }

//Write the program to remove duplicate characters from a given string.