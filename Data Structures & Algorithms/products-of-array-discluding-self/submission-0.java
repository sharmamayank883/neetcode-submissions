class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int size = nums.length;

        left[0] = 1;
        right[size-1] = 1;

        for(int i = 1; i<nums.length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }

        for(int i = size-2; i>=0; i--) {
            right[i] = right[i+1]*nums[i+1];
        }

        int[] sol = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            sol[i] = left[i]*right[i];
        }

        return sol;
    }
}  
