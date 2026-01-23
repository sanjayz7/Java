public class ToweOfHanoi {
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void  tower(int n,char s,char h,char d){
        if(n==1){
            System.out.println("disk is moved from source '"+s+"' to destination  '"+d+"'"); 
           return;
        }
        tower(n-1,s,d,h);
        tower(1,s,h,d);
        tower(n-1,h,s,d);
    }
    public static void main(String[] args) {
        
       tower(3,'S','H','D');
    }

}
