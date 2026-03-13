class Solution {
    public int search(int[] nums, int target) {

        int beg = 0;
        int end = nums.length - 1;

        while (beg < end) {

            int mid = (beg + end) / 2;

            // If target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left side is sorted
            if (nums[beg] <= nums[mid]) {

                if (nums[beg] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }

            } 
            // Right side is sorted
            else {

                if (nums[mid] <= target && target <= nums[end]) {
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return nums[end] != target ? -1 : end;
    }
}