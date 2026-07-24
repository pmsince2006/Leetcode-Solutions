class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()){
        //     return false;
        // }

        // HashMap<Character,Integer> map = new HashMap<>();

        // for(int i = 0; i < s.length();i++){
        //     char ch = s.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }

        // for(int i = 0; i< t.length(); i++){
        //     char ch = t.charAt(i);
        //     if(!map.containsKey(ch)){
        //         return false;
        //     }
        //     map.put(ch,map.get(ch)-1);

        //     if(map.get(ch) < 0){
        //         return false;
        //     }
        // }

        // return true;

        if(s.length() != t.length()){
            return false;
        }

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        // int i = 0;
        // while(i < s1.length && i < s2.length){
        //     if(s1[i] != s2[i]){
        //         return false;
        //     }
        //     i++;
        // }

        return Arrays.equals(s1,s2);
    }
}