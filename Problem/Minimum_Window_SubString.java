class Solution {

    public String minWindow(String s, String t) {
        
        if (s.length() == 0 || t.length() == 0) return "";
        
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        // Store frequency of characters in t
        for (char ch : t.toCharArray()) {
            mapT[ch]++;
        }

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        // Expand window using right pointer
        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            mapS[s.charAt(right)]++;

            // Try to shrink window if valid
            while (contains(mapS, mapT)) {

                // Update minimum length
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                // Remove left character and shrink window
                mapS[s.charAt(left)]--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE 
                ? "" 
                : s.substring(minStart, minStart + minLen);
    }

    // Check if current window contains all characters of t
    private boolean contains(int[] mapS, int[] mapT) {
        for (int i = 0; i < 256; i++) {
            if (mapT[i] > mapS[i]) {
                return false;
            }
        }
        return true;
    }
}