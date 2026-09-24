class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=nums[0];
        int max1=curr_sum;
        for(int i=1;i<nums.length;i++){
            curr_sum=Math.max(nums[i],nums[i]+curr_sum);

            max1=Math.max(curr_sum,max1);
        }
        return max1;
    }
}