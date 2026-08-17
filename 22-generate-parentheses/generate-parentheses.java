class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> list = new ArrayList<>();
       backTracking(n,list,0,0,""); 
       return list;
    }
    public void backTracking(int n,List<String>result,int open,int close,String s){
        if(n*2 == s.length()){
            result.add(s);
            return;
        }
        if(open < n){
            backTracking(n,result,open+1,close,s+'(');
        }
        if(close < open){
            backTracking(n,result,open,close+1,s+')');
        }
    }


}