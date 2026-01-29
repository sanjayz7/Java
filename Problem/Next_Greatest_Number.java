import java.util.ArrayList;
import java.util.Stack;

class GfG {
    // Finds the next greater element for each item in the array
    static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // Start with -1 for all results
        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        // Go from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            // If stack has something, that's the next greater
            if (!stack.isEmpty()) {
                result.set(i, stack.peek());
            }
            // Push current element for future checks
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        ArrayList<Integer> res = nextLargerElement(arr);
        // Print result in a chill way
        for (int x : res) {
            System.out.print(x + " ");
        }
        // Output: 8 -1 1 3 -1
    }
}