/*class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum=0;
        double ans=0;
        for(int i=0;i<k;i++){
            max_sum+=nums[i];
            
        }
        ans=max_sum/k;

        for(int i=k;i<nums.length;i++){
            max_sum=max_sum+nums[i]-nums[i-k];
            
            Math.max(ans,max_sum/k);
            
        }
        return ans;
    }
}*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double max_sum = 0;
        double ans = 0;

        for (int i = 0; i < k; i++) {
            max_sum += nums[i];
        }

        ans = max_sum / k;

        for (int i = k; i < nums.length; i++) {

            max_sum = max_sum + nums[i] - nums[i-k];

            ans = Math.max(ans, max_sum / k);
        }

        return ans;
    }
}