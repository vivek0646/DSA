class Solution {
    public long countCommas(long n) {
        long res =0;
        long curr=1000;

        while(n >= curr){
            res += n - curr +1;
            curr = curr * 1000;
        }
        return res;
    }
}