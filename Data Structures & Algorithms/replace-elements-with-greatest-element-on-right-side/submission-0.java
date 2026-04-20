class Solution {
    public int[] replaceElements(int[] arr) {
      int maxRight = -1;
      int[] sol = new int[arr.length];
      sol[arr.length-1] = -1;
      for(int i = arr.length-2; i>=0; i--) {
        maxRight = Math.max(arr[i+1], maxRight);
        System.out.printf("%d %d %d \n", arr[i+1], arr[i], maxRight);
        sol[i] = maxRight;
      }  

      return sol;
    }
}