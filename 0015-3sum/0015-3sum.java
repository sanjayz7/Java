class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l;
        int r;
        List<List<Integer>> res= new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            l=i+1;
             if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int target=-nums[i];
            r=nums.length-1;
            while(l<r){
                
                int sum=nums[l]+nums[r];
                if(target==sum){
                   
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                   // Skip duplicate left values
                    while (l< r &&
                           nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicate right values
                    while (l < r &&
                           nums[r] == nums[r+1]) {
                        r--;
                    }

                }
                else if(sum<target)l++;
                else{
                    r--;
                }
            }
        }
        return res;
    }
}