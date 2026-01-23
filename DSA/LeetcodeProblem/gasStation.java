package DSA.LeetcodeProblem;

public class gasStation {
  
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int index = 0;
        int gascount = 0;

        for (int i = 0; i < n; i++) {
            gascount += gas[i] - cost[i];
            if (gascount < 0) {
                index = i + 1;
                gascount = 0;
            }
        }

        int totalgas = 0;
        int totalcost = 0;
        for (int i = 0; i < n; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }

        if (totalgas < totalcost)
            return -1;

        return index; 
    }

}
