class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum =0;
        int rightsum =0;
        for(int i=0; i<nums.length; i++){
            rightsum += nums[i];  //cal the total sum of the array
        }

        for(int i=0; i<nums.length; i++){
            rightsum -= nums[i];  //then min the total sum - one by one from st of arr

            if(rightsum == leftsum){
                return i;               //ans if equal  
            }
            leftsum += nums[i];         //left will increase;
        }
        return -1;
    }
}