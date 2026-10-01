class Solution {

    private Map<Integer, Integer> stoneToIndex;
    private Boolean[][] memo;
    private int[] stones;

    public boolean canCross(int[] stones) {
        this.stones = stones;
        int n = stones.length;

        stoneToIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            stoneToIndex.put(stones[i], i);
        }

        memo = new Boolean[n][n];

        return dfs(0, 0);
    }

    private boolean dfs(int index, int lastJump) {

        if (index == stones.length - 1) {
            return true;
        }

        if (memo[index][lastJump] != null) {
            return memo[index][lastJump];
        }

        for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {

            if (jump <= 0) {
                continue;
            }

            int nextStone = stones[index] + jump;

            if (stoneToIndex.containsKey(nextStone)) {

                int nextIndex = stoneToIndex.get(nextStone);

                if (dfs(nextIndex, jump)) {
                    return memo[index][lastJump] = true;
                }
            }
        }

        return memo[index][lastJump] = false;
    }
}