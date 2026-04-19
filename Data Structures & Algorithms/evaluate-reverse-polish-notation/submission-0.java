class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (String s : tokens) {
            // Use .equals() for string comparison in Java
            if (s.equals("+")) {
                numStack.push(numStack.pop() + numStack.pop());
            } else if (s.equals("-")) {
                // Order matters: a - b
                int b = numStack.pop();
                int a = numStack.pop();
                numStack.push(a - b);
            } else if (s.equals("*")) {
                numStack.push(numStack.pop() * numStack.pop());
            } else if (s.equals("/")) {
                // Order matters: a / b
                int b = numStack.pop();
                int a = numStack.pop();
                numStack.push(a / b);
            } else {
                // It's a number
                numStack.push(Integer.parseInt(s));
            }
        }

        return numStack.pop();
    }
}
