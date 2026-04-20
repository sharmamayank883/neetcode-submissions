class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];
        // Stack stores indices of temperatures
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // While current temp is warmer than the temp at the top of the stack
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                results[prevIndex] = i - prevIndex;
            }
            // Push current index onto stack
            stack.push(i);
        }

        return results;
    }
}
