class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int strow =0;
        int stcol =0;
        int endrow = matrix.length-1; 
        int endcol = matrix[0].length -1;
while(strow <= endrow && stcol<= endcol){
        for(int i = stcol; i<= endcol; i++){
            res.add(matrix[strow][i]);
        }
        for(int j= strow+1; j<= endrow; j++){
            res.add(matrix[j][endcol]);
        }

        if(strow < endrow){
            for(int i=endcol-1; i>= stcol; i--){
                res.add(matrix[endrow][i]);
            }
        }
        if(stcol < endcol){
            for(int j =endrow-1; j>= strow+1; j--){
                res.add(matrix[j][stcol]);
            }
        }
        strow++;
        stcol++;
        endrow--;
        endcol--;
    }
    return res;
    }
}