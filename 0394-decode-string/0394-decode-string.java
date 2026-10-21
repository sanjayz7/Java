class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> strings = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                num=num*10+(c-'0');

            }
            else if (c == '[') {
                counts.push(num);
                strings.push(current);
                current = new StringBuilder();
                num=0;
            }
            else if(c==']'){
                int rep=counts.pop();
                StringBuilder prev=strings.pop();
                for(int i=0;i<rep;i++){
                    prev.append(current);
                }
                current=prev;
            }
            else{
                current.append(c);
            }
        }
        return current.toString();

    }
}