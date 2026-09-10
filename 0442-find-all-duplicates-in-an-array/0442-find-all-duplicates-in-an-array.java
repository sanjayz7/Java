class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int n:nums){
            int idx=Math.abs(n)-1;
            if(nums[idx]<0){
                ans.add(Math.abs(n));
            }
            else{
                nums[idx]=-nums[idx];
            }
        }
        return ans;
    }
}