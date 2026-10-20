
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];

        java.util.Stack<Integer> s = new java.util.Stack<>();

        // Previous Smaller Element (PSE)
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() &&
                   heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            pse[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }

        s.clear();

        // Next Smaller Element (NSE)
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() &&
                   heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            nse[i] = s.isEmpty() ? n : s.peek();
            s.push(i);
        }

        // Calculate maximum rectangle area
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
