class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] arr = new int[n - k + 1];
        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside the window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.removeLast();
            }

            // Add current index
            dq.addLast(i);

            // Window is ready
            if (i >= k - 1) {
                arr[idx++] = nums[dq.peekFirst()];
            }
        }

        return arr;
    }
}