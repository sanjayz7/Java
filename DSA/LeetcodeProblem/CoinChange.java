
public class CoinChange {
    public static void main(String a[]){
  int coins[] ={1,2,5};
  int amount=11;
  int count=0;
  int n=coins.length;
  for(int i=n-1;i>=0;i--){
while(amount >= coins[i]){
  amount = amount -coins[i];
  count=count+1;
}
  }
  if(amount == 0){
  System.out.println(count);
  
  }
  else{
 System.out.println(-1);
}}
}
