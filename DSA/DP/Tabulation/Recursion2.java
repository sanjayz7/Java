package DSA.DP;

public class Recursion2 {
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online


   public static int fib(int n,int dp[]){
dp[0]=0;
dp[1]=1;
for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    
    public static void main(String[] args) {
       Recursion2 m = new Recursion2();
       int n=50;
       int dp [] = new int [n+1];
       System.out.print(m.fib(n,dp));
    }
}
