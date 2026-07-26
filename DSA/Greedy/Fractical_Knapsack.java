class ItemsList{
    int val;
    int wt;
    ItemsList (int val,int wt){
        this.val=val;
        this.wt=wt;
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        ItemsList []items= new ItemsList[val.length];
        for(int i=0;i<val.length;i++){
        items[i]=new ItemsList(val[i],wt[i]);
        }
        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double)b.val / b.wt,
                (double)a.val / a.wt
            )
        );
        double ans=0;
        for(int i=0;i<val.length;i++){
            if(items[i].wt<=capacity){
                capacity-=items[i].wt;
                ans+=items[i].val;
            }
            else{
                ans+=capacity*((double)items[i].val/items[i].wt);
                break;
            }
        }
        return ans;
    }
}