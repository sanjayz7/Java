package DSA.DP.Knapsack;
//Tabulation approach for 0/1 Knapsack problem
public class r2 {
  public static int knapsack(int val[],int wt[],int w,int n) {
        // Base case: No items left or capacity is 0
        
       int dp[][]=new int [n+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=0;
            }
        }
        // If weight of the nth item is more than the knapsack capacity, skip it
     for(int i=1;i<=n;i++){
      for(int j=1;j<=w;j++){
        if(wt[i-1]<=j){
          dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-wt[i-1]]+val[i-1]);
        }
        else{
          dp[i][j]=dp[i-1][j];
        }
      }
     }

        return dp[n][w];
 
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int w= 50;
        int n = val.length;
     
        

        System.out.println("Maximum value in knapsack = " + knapsack(val,wt,w,n));
    }
}
