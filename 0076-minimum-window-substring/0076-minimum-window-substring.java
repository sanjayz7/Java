class Solution {
    public String minWindow(String s, String t) {
        int l = 0;
        HashMap<Character, Integer> t_m = new HashMap<>();
        HashMap<Character, Integer> s_m = new HashMap<>();
        for(char c:t.toCharArray()){

            // Add right element
          t_m.put(c,t_m.getOrDefault(c, 0) + 1);

        }
            
            int min_len=Integer.MAX_VALUE;

            String out="";

            for(int r=0;r<s.length();r++){

               char ch=s.charAt(r);

               s_m.put(ch,s_m.getOrDefault(ch, 0) + 1);
                while (isValid(s_m, t_m)) {

                    int len = r - l + 1;

                    if (min_len > len) {
                        out = s.substring(l, r + 1);
                        min_len = len;
                    }

                    char remove = s.charAt(l);
                    s_m.put(remove, s_m.get(remove) - 1);

                    l++;
                }

            }
            return out;
        }

       public boolean isValid(HashMap<Character, Integer> s_m,
                       HashMap<Character, Integer> t_m) {

            for (char c : t_m.keySet()) {
                if (s_m.getOrDefault(c, 0) < t_m.get(c)) {
                    return false;
                }
            }
            return true;
        }
    }
