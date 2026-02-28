class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] s1 = new char[n];
        for(int i = n-1;i>=0;i--){
            s1[i] = s[n-1-i];
        }
        for (int i = 0; i < n; i++) {
            s[i] = s1[i];
        }
    }
}