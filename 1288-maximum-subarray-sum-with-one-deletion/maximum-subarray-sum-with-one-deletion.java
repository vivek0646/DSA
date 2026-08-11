class Solution {
    public int maximumSum(int[] arr) {
        int keep = arr[0];
        int delete = 0; // Maximum sum with one 
        int ans = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
 
            delete = Math.max(delete + arr[i], keep);
            
            // Kadane's algorithm
            keep = Math.max(arr[i], keep + arr[i]);
    
            ans = Math.max(ans, Math.max(keep, delete));
        }
        
        return ans;
    }
}