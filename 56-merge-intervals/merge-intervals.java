class Solution {
    public int[][] merge(int[][] n) {
        Arrays.sort(n, (a,b) -> a[0]-b[0]);  //sort the 2d array
        ArrayList <int[]> res = new ArrayList<>();     //array list

        int start1 = n[0][0];
        int end1 = n[0][1];

        for(int i =1; i<n.length; i++){
            int start2 = n[i][0];
            int end2 = n[i][1];

            if(end1 >= start2){  //overlap
                end1 = Math.max(end1, end2);
            }
            else{           //no overlap
                res.add(new int[]{start1, end1});
                start1 = start2;
                end1 = end2;
            }
        }
        res.add(new int[]{start1, end1});
        return res.toArray(new int[res.size()] [] );
    }
}