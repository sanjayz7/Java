class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int total=nums[i]+nums[r]+nums[l];
                if(total==0){
                    List <Integer> ans= new ArrayList<>();
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l<r&&nums[l-1]==nums[l]){
                        l++;
                    }
                }
                else if(total>0){
                    r--;
                }
                else{
                    l++;
                }
            }
            
        }

        return res;
    }
}