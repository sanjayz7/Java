
public class recursive {
  public class KnapsackRecursive {
//Memorization approach for 0/1 Knapsack problem
    // Recursive function to solve 0/1 Knapsack problem
    public static int knapsack(int val[],int wt[],int w,int n,int dp[][]) {
        // Base case: No items left or capacity is 0
        
        if (n == 0 || w == 0)
            return 0;
            if(dp[n][w]!=-1)

                return dp[n][w];
        // If weight of the nth item is more than the knapsack capacity, skip it
        if (wt[n - 1] <=w)
         {

        // Case 1: Include the item
        int include = val[n - 1] + knapsack(val,wt,w-wt[n-1],n-1,dp);
        // Case 2: Exclude the item
        int exclude = knapsack(val,wt,w, n - 1,dp);

        // Return the maximum of both choices
        return Math.max(include, exclude);
    }
    else{
        return knapsack(val,wt,w,n-1,dp);
    }
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int w= 50;
        int n = val.length;
        int dp [][]=new int [n+1][w+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        

        System.out.println("Maximum value in knapsack = " + knapsack(val,wt,w,n,dp));
    }
}

}
