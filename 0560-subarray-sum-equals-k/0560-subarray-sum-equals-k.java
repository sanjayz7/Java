class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); // To handle subarrays starting at index 0
        int prefix = 0, count = 0;

        for (int num : nums) {
            prefix += num;
            int complement=prefix-k;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}