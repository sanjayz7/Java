package DSA.GeeksForGeeksProblem;

public class Fractional_Knapsack {
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        int val[]={300,100,200};
        int weight[]={20,10,50};
        int w=70;
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/weight[i];
            
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w;
        int final_val=0;
        for(int i=ratio.length-1;i>=0;i--){
            int index=(int)ratio[i][0];
            if(capacity>=weight[index]){
                final_val = final_val+ val[index];
                capacity=capacity-weight[index];
            }
            else{
                final_val += (capacity*(int)ratio[i][1]);
                capacity=0;
                break;
            }
        }
        System.out.println("Maximum value of Knapsack is :"+final_val);
    }

}
