class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0;
        int best_dis=Integer.MAX_VALUE;
        int dis=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                
                int curr_sum=nums[i]+nums[l]+nums[r];
                int curr_dis=Math.abs(target-curr_sum);

                if(best_dis>curr_dis){
                    
                    best_dis = curr_dis;
                    ans = curr_sum;
                }
                 if (curr_sum == target) {
                    return curr_sum;
                }
                else if(curr_sum<target) l++;
                else{
                    r--;
                }
            }
            
        }
        return ans;
    }
}