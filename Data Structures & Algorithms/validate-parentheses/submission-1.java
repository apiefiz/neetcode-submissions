class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
        
           char c=s.charAt(i);
            if (c == '(' || c == '{' || c=='[')
                st.push(s.charAt(i));
            else {
                if (c == ')') {
                    if (st.empty() || st.pop() != '(') {
                        return false;
                    }
                }
                if (c == ']') {
                    if (st.empty() || st.pop() != '[') {
                        return false;
                    }
                }
                if (c == '}') {
                    if (st.empty() || st.pop() != '{') {
                        return false;
                    }
                }
            }
        }
    return st.isEmpty();
    }
}
