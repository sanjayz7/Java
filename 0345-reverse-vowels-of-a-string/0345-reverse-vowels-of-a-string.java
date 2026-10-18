class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder();
        int l=0;
        int r=s.length()-1;

        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');  
        while(l<r){
            if(set.contains(arr[l])){
                while(!set.contains(arr[r])&&l<r){
                    r--;
                }
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r-- ;       
            }
            l++;
            
        }
        return new String(arr);
    }
}