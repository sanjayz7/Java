public class Solution {
    // Expand around the center and return left, right, and length
    private int[] expandAroundCenter(String s, int left, int right) {
        while (left > 0 && right < s.length() - 1 && s.charAt(left - 1) == s.charAt(right + 1)) {
            left--;
            right++;
        }
        return new int[]{left, right, right - left + 1};
    }

    public String longestPalindrome(String s) {
        int maxLen = 0, left = 0, right = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            // Odd length palindrome
            int[] odd = expandAroundCenter(s, i, i);
            if (odd[2] > maxLen) {
                maxLen = odd[2];
                left = odd[0];
                right = odd[1];
            }

            // Even length palindrome
            if (s.charAt(i) == s.charAt(i + 1)) {
                int[] even = expandAroundCenter(s, i, i + 1);
                if (even[2] > maxLen) {
                    maxLen = even[2];
                    left = even[0];
                    right = even[1];
                }
            }
        }

        return s.substring(left, right + 1);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "cbbd";
        System.out.println("Longest Palindromic Substring: " + sol.longestPalindrome(s));
    }
}
