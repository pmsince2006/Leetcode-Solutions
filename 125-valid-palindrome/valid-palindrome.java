class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String original = sb.toString();
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }
}