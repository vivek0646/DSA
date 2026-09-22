class Solution {
    public int[] dailyTemperatures(int[] temp) {
       int n = temp.length;
       int res[] = new int[n];

       Stack<Integer> st = new Stack<>();
       int r = 1;
       for(int i =0; i< n; i++){
       while(!st.isEmpty() && temp[st.peek()] < temp[i]){
               int l = st.pop();
               res[l] = i - l;
       } 
       st.push(i);
    }
    return res;
    }
}