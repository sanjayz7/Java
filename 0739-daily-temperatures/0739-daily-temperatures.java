class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int arr[] = new int[nums.length];

        Stack<Integer> s = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                arr[i] = 0;
            } else {
                arr[i] = s.peek()-i;
            }

            s.push(i);
        }
        return arr;
    }
}