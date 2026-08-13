class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];

        int maxans = nums[0];
        int minans = nums[0];

        int total = 0;

        for(int i=0; i< nums.length; i++){
            total += nums[i];
            if(i>0){
            
            maxsum = Math.max(maxsum+ nums[i], nums[i]);
            maxans = Math.max(maxans, maxsum);

            minsum = Math.min(minsum+nums[i], nums[i]);
            minans = Math.min(minans, minsum);

            }
        }
        if(maxans < 0){ 
            return maxans;
        }
        int circularSum = total - minans;

        return Math.max(maxans, circularSum);
    }
}