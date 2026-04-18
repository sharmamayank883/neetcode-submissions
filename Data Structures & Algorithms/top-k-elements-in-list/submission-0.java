class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
       HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
       for(int n: nums) {
        freq.put(n, freq.getOrDefault(n, 0)+1);
        System.out.println(freq.toString());
       } 
        // 2. Keep a Min-Heap of size K: O(N log K)
        // We order by frequency (the map value)
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            Comparator.comparingInt(freq::get)
        );

        for (int num : freq.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the lowest frequency
            }
        }

        // 3. Build the result array: O(K log K)
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        
        return result;
    }
}
