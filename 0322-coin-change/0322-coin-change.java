class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans[]= new int [amount+1];
        Arrays.fill(ans, amount + 1);

        ans[0]=0;
        for(int i=0;i<=amount;i++){
            for(int amt:coins){
                if(amt>i)continue;;
                ans[i]=Math.min(ans[i-amt]+1,ans[i]);
            }
        }
        return ans[amount] > amount ? -1 : ans[amount];
    }
}