class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
            int ans=0;
            
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int last=intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
                   int start =intervals[i][0];
                   
                   if(start<last){
                    
                    ans++;
                   }
                   
                   else{
                    last=intervals[i][1];
                   }

        }
        return ans; 
    }
}