class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] sol = new int[(2*nums.length)];

        for(int i=0; i<nums.length; i++) {
            sol[i] = nums[i];
        }

        for(int i = nums.length; i<sol.length; i++) {
            sol[i] = nums[i-nums.length];
        }

        return sol;
    }
}