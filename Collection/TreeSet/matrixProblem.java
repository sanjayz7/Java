public class matrixProblem {
  public static void main(String[] args) {
      int rows,cols;
     int m [][]={
         {10,20,30},
         {40,50,60},
         {70,80,90}
     } ;
      
      rows=m.length;
      cols = m[0].length;
      for(int i=0;i<rows;i++){
          for(int j=0;j<cols;j++){
              if(i<j){
                 
                  System.out.print("0 "+" ");
                  
                  
              }
              else{
                   System.out.print(m[i][j]+" ");
              }
          }
          System.out.println();
      }
     
  }
}

