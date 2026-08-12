class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int maxend = arr[0];
        int minend = arr[0];
        int minend2 = Math.abs(arr[0]);
        int ans = Math.abs(arr[0]);

        for(int i = 1; i< arr.length; i++){
            maxend = Math.max(maxend + arr[i], arr[i]);
            minend = Math.min(minend+arr[i], arr[i]);
            minend2 = Math.max(minend2, Math.abs(minend));

            ans = Math.max(ans, Math.max(maxend, minend2));
        }
        return ans;
    }
}