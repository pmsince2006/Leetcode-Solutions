import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        int maxlength = 0;

        st.push(-1);

        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int length = i - st.peek();
                    maxlength = Math.max(length,maxlength);
                }
            }
        }

        return maxlength;
    }
}