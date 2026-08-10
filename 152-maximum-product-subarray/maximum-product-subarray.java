class Solution {
    public int maxProduct(int[] a) {
        int res = a[0];
        int minending = a[0];
        int maxending = a[0];

        for(int i =1; i<a.length; i++){
            int v1 = a[i];
            int v2 = minending * a[i];
            int v3 = maxending * a[i];

            maxending = Math.max(v1, Math.max(v2, v3));
            minending = Math.min(v1, Math.min(v2, v3));
            res = Math.max(res, Math.max(maxending, minending));
        }
        return res;
    }
}