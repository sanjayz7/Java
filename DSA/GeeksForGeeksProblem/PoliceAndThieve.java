package DSA.GeeksForGeeksProblem;

public class PoliceAndThieve {
  
    public int catchThieves(char[] arr, int k) {
        // code here
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
               if(arr[i] == 'P'){
                int start= (i-k)>0?i-k:0;
                int end = (i+k)<n?i+k:n-1;
                for(int j=start;j<=end;j++){                                    
                    if(arr[j]=='T'){
                        count++;
                        arr[j]='C';
                        arr[i]='C';
                        break;
                    }
                }
            }
           
        }
        return count;
       
    }
    public static void main(String[] args) {
         PoliceAndThieve p=new PoliceAndThieve();
         char [] n ={'T','T','P','P','T','P'};
         int k=2;
        System.out.println(p.catchThieves(n,k));

    }

}
