
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 0;

        // Find the maximum pile size
        for (int pile : piles) {
            hi = Math.max(hi, pile);
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (is_feasible(mid, piles, h)) {
                hi = mid - 1;  // Try a smaller speed
            } else {
                lo = mid + 1;  // Need a higher speed
            }
        }

        return lo; // Minimum feasible speed
    }

    public boolean is_feasible(int mid, int[] piles, int h) {
        long total_hours = 0;

        for (int pile : piles) {
            total_hours += (pile + mid - 1) / mid;
        }

        return total_hours <= h;
    }
}
