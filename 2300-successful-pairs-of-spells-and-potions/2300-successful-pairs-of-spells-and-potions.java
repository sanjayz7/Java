class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int ans[]= new int [spells.length];
        for(int i=0;i<spells.length;i++){
            int l=0;
            int r=potions.length-1;
           
            int idx=r+1;
            while(l<=r){
                int mid=l+(r-l)/2;
                //int value=spells[i]*potions[mid];
                long value = (long) spells[i] * potions[mid];
                if(value>=success){
                    idx=mid;
                    r=mid-1;

                }
                else{
                    l=mid+1;
                }
            }
            ans[i]=potions.length-idx;
        }
        return ans;
    }
}