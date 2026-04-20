class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for(int n: nums) {
            numSet.add(n);
        }

        int longestSeq = 0;

        for(int n: nums) {
            if(!numSet.contains(n-1)) {
                int currentSeq = 1;
                int currentNum = n;

                while(numSet.contains(currentNum + 1)) {
                    currentSeq++;
                    currentNum++;
                }

                longestSeq = Math.max(longestSeq, currentSeq);
            }
        }

        return longestSeq;
    }
}
