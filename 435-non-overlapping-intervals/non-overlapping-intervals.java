class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[1]-b[1] ); 
        int n = intervals.length; 
        int end = intervals[0][1];
        int count =0;
        for(int i = 1; i<n ; i++){
            int si = intervals[i][0]; //start index
            int ei = intervals[i][1]; //end index
            if(end > si){
                count ++;
            }
            else
                end = ei;
        }
        return count;
    }
}