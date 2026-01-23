import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Main{
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
  //  int randomInt =ThreadLocalRandom.current().nextInt(10,100);
  Random rand = new Random();
  int randomInt=rand.nextInt(90)+10;
    boolean flag=true;
    System.out.println("Welcome to Two-Digit Guessing Game");
    System.out.println("I have picked a number between 10 and 99 :Try to guess");
    
    while(flag){
        int n;
        System.out.print("Give it a try :");
        n=s.nextInt();
        if(n>randomInt){
            System.out.println("It is too big");
        }
        else if(n<randomInt){
            System.out.println("It is too less");
        }
        else {
            flag=false;
            System.out.println("You got right one");
        }
        
    }
    System.out.println("Thank you");
    
    
  }
}
