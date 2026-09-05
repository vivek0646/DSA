import java.util.*;
class Solution {
   static int dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n]; 
        Arrays.fill(dp, -1);
          return Math.min(mincost(0, cost), mincost(1, cost));
    }
    private int mincost(int i, int arr[]){
        if(i>= arr.length) return 0;
        if(dp[i]!= -1) return dp[i];
        return dp[i]= arr[i]+ Math.min(mincost(i+1, arr),mincost(i+2, arr));
    }
}