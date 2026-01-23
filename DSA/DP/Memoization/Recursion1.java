package DSA.DP;

public class Recursion1 {
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online


   public static int fib(int n,int dp[]){
        if(n==0||n==1)
        return n;
        if(dp[n] !=0){
            return dp[n];
            
        }
        dp [n] =fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
       Recursion1 m = new Recursion1();
       int n=50;
       int dp [] = new int [n+1];
       System.out.print(m.fib(n,dp));
    }
}
