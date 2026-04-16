class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        char[] c = cleaned.toCharArray();

        int i = 0;
        int j = c.length-1;

        while(i<j) {
            if(c[i] != c[j]) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
    }
}
