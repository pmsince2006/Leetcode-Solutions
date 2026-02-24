class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int n = Math.min(word1.length(),word2.length());
        for(int i = 0;i < n; i++){
            res += word1.charAt(i);
            res += word2.charAt(i);
        }
        res += word1.substring(n);
        res += word2.substring(n);

        return res;
    }
}