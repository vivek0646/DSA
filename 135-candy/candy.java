class Solution {
    public int candy(int[] ratings) {
        int res[] = new int[ratings.length];
        Arrays.fill(res, 1)  ;
        for(int i =1; i<ratings.length; i++){
        if(ratings[i] > ratings[i-1]){
            res[i] = res[i-1] +1 ; //prev wale se extra candy millne chiye, current ma
        } }

    for(int i = ratings.length -2; i>= 0; i--){
        if(ratings[i] > ratings[i+1]){
            res[i] = Math.max(res[i], res[i+1]+1);  //use max fun to avoid the overwrite the smaller value at index, which have bigger value.
        }}

        int sum =0;
        for(int j =0; j<res.length; j++){
            sum += res[j];
        }
        return sum;
        
    }
}