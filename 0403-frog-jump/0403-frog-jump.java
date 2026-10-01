class Solution {

    boolean[][] dp;

    public boolean canCross(int[] stones) {

        int n = stones.length;

        // First jump must be 1
        if (stones[1] != 1) {
            return false;
        }

        dp = new boolean[n][n];

        return helper(stones, 0, 1);
    }

    boolean helper(int[] stones, int lastIndex, int currentIndex) {

        // Reached last stone
        if (currentIndex == stones.length - 1) {
            return true;
        }

        // Already explored and failed
        if (dp[lastIndex][currentIndex]) {
            return false;
        }

        int lastJump =
                stones[currentIndex] - stones[lastIndex];

        int nextIndex = currentIndex + 1;

        while (nextIndex < stones.length &&
               stones[nextIndex] <= stones[currentIndex] + lastJump + 1) {

            int nextJump =
                    stones[nextIndex] - stones[currentIndex];

            int diff = nextJump - lastJump;

            if (diff >= -1 && diff <= 1) {

                if (helper(stones, currentIndex, nextIndex)) {
                    return true;
                }
            }

            nextIndex++;
        }

        // Mark state as failed
        dp[lastIndex][currentIndex] = true;

        return false;
    }
}