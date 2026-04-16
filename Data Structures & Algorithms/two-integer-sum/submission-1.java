class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complimentMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++) {
            int y = target - nums[i];

            if(complimentMap.containsKey(y)) {
                int j = complimentMap.get(y);
                int[] sol = {j,i};
                return sol;
            } else {
                complimentMap.put(nums[i], i);
            }
        }

        return new int[0];
    }
}
