package DSA.DP.Knapsack;

public class recursive {
  public class KnapsackRecursive {

    // Recursive function to solve 0/1 Knapsack problem
    public static int knapsack(int W, int[] wt, int[] val, int n) {
        // Base case: No items left or capacity is 0
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than the knapsack capacity, skip it
        if (wt[n - 1] > W)
            return knapsack(W, wt, val, n - 1);

        // Case 1: Include the item
        int include = val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1);
        // Case 2: Exclude the item
        int exclude = knapsack(W, wt, val, n - 1);

        // Return the maximum of both choices
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int W = 50;
        int n = val.length;

        System.out.println("Maximum value in knapsack = " + knapsack(W, wt, val, n));
    }
}

}
