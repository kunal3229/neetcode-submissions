class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for(char ch : s.toCharArray()){
            if(closeToOpen.containsKey(ch)){
                if(!st.isEmpty() && st.peek() == closeToOpen.get(ch)) st.pop();
                else return false;
            }else st.push(ch);
        }
        return st.isEmpty();
    }
}
