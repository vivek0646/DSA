class Solution {
    public double myPow(double x, int n) {
        double res = FP(x, Math.abs(n));
        if(n < 0) return 1/res;
        return res;
    }
    private double FP(double x, int n){
        if(n==0) return 1;
        double val = FP(x, n/2);
        val = val*val;
        if(n%2 == 0 ) return val;
        else return val*x;
    }
}