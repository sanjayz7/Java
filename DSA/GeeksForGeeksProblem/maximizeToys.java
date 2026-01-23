package DSA.GeeksForGeeksProblem;

import java.util.Arrays;

public class maximizeToys {
  public static void main(String[] args) {
      int a[]={1,12,5,111,200,1000,10};
      int n=a.length;
      int K=50;
      Arrays.sort(a);
      int sum=0;
      for(int i=0;i<n;i++){
      sum +=a[i];
      if(sum>K){
        System.out.print(i);
        break;
      }

      }
  }
}
