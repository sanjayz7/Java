class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[r-1]){
                nums[idx++]=nums[r];
            }
        }
        return idx;
    }
}