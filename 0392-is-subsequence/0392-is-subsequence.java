class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        if (t.length() == 0) {
            return false;
        }
        int mat[][]= new int [s.length()][t.length()];
       
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){

              
                if (s.charAt(i) == t.charAt(j)) {
                    if(i>0&&j>0){
                        mat[i][j]=mat[i-1][j-1]+1;
                    }
                    else{
                        mat[i][j]=1;
                    }
                }
                else{
                    int k=i>0?mat[i-1][j]:0;
                    int m=j>0?mat[i][j-1]:0;
                    mat[i][j]=Math.max(k,m);
                  
                }

            }
        }
            return mat[s.length() - 1][t.length() - 1] == s.length();
        
    }
}