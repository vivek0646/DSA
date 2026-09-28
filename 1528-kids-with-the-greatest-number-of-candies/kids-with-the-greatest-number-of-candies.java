class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int num =0;
        for(int i =0; i<n; i++){
            if(candies[i] > num){
                num = candies[i];
            }} 

        int res[] = new int[n];
        for(int i =0; i<n; i++){
            res[i] = candies[i] + extraCandies;
        }

        for(int i=0; i<n; i++){
            if(res[i] >= num){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}