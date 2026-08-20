class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        int i =0;
        while(i<n && intervals[i][1] < newInterval[0]){  //true condi...we add the value direct
            res.add(intervals[i]);
            i++;
        }
            //this is main part:- merge happen
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0] );
            newInterval[1] = Math.max(newInterval[1],intervals[i][1] );
            i++;
        }
        res.add(newInterval);
        
        while(i<n){         //add the left-over part, after merge
            res.add(intervals[i++]);
        }
        return res.toArray(new int[res.size()] []);
    }
}