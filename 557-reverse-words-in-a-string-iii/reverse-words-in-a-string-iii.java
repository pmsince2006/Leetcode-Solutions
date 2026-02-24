class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder rev = new StringBuilder();

        for(int i = 0; i< words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            rev.append(sb.reverse());

            if(i < words.length - 1){
                rev.append(" ");
            }
        }
        return rev.toString();
        
    }
}