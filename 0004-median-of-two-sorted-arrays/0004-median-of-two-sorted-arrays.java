class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int smaller[]= nums1.length>nums2.length?nums2:nums1;
        int larger[]= nums1.length>nums2.length?nums1:nums2;
        int low=0;
        int high=smaller.length;
        int total_len=nums1.length+nums2.length;
        while(low<=high){
            int partitionA=(low+high)/2;
            int partitionB=(total_len+1)/2-partitionA;
           
            int L1 = (partitionA == 0)
                    ? Integer.MIN_VALUE
                    : smaller[partitionA - 1];

            int R1 = (partitionA == smaller.length)
                    ? Integer.MAX_VALUE
                    : smaller[partitionA];

            int L2 = (partitionB == 0)
                    ? Integer.MIN_VALUE
                    : larger[partitionB - 1];

            int R2 = (partitionB == larger.length)
                    ? Integer.MAX_VALUE
                    : larger[partitionB];

            // Correct partition found
            if (L1 <= R2 && L2 <= R1) {

                // Odd total length
                if ((total_len) % 2 == 1) {
                    return Math.max(L1, L2);
                }

                // Even total length
                return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
            }

            // Move left
            else if (L1 > R2) {
                high = partitionA - 1;
            }

            // Move right
            else {
                low = partitionA + 1;
            }
        }
        return 0.0;

       
      
    }
}