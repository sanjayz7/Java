class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        // Process all elements
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {

                int element = st.pop();

                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();

                int area = heights[element] * (nse - pse - 1);

                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        // Process remaining elements
        while (!st.isEmpty()) {

            int nse = n;
            int element = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();

            int area = heights[element] * (nse - pse - 1);

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}