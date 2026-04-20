class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int maxSoFar = 0;

        for(int n: nums){
            if(n==1) {
                maxSoFar++;
            } else {
                max = Math.max(max, maxSoFar);
                maxSoFar = 0;
            }
        }

        return Math.max(max, maxSoFar);
    }
}