class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        if(charArray.length == 1) {
            return false;
        }
        for(char c: charArray) {
            if(c == '(' || c =='{' || c == '[') {
                stack.push(c);
            } else if(stack.isEmpty()) {
                return false;
            } else if(c == ')' && stack.pop() != '(') {
                return false;
                
            } else if(c == '}' && stack.pop() != '{') {
                return false;
            } else if(c == ']' && stack.pop() != '[') {
                return false; 
            } else {
                continue;
            }
        }

        return stack.isEmpty();
    }
}
