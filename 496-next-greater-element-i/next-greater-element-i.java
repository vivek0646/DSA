class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int val : nums2){
            while(!st.isEmpty() && st.peek() < val){
                map.put(st.pop(), val);
            }
            st.push(val);
        }
        while(!st.isEmpty()){
            map.put(st.pop(), -1);
        }

        int res[] = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i] = map.get(nums1[i]);
        }
        return res;

    }
}