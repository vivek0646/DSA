class Pair implements Comparable<Pair>{
    int ele;
    int freq;
    Pair(int ele, int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair p){
        if(this.freq == p.freq) return this.ele - p.ele;
        return this.freq - p.freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele: map.keySet()){
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
            if(pq.size() > k) pq.remove();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(pq.size() > 0){
            Pair top = pq.remove();
            ans.add(top.ele);
        }
        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}