class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }   
  
        int ans=0;
        for(int i=0;i<nums.length;i++){
             int value=0;
            for(int j=0;j<i;j++){
               
                if(nums[j]<nums[i]){
                    value=Math.max(value,dp[j]);
                    dp[i]=Math.max(dp[i],value+1);
                }
            }
            ans=Math.max(ans,dp[i]);
            
        }
        return ans ;
    }
}