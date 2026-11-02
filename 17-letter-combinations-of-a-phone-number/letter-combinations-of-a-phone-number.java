class Solution {
        Map<Character , String> map = new HashMap<>();
        { 
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        }
        List<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();

    public List<String> letterCombinations(String digits) {

        GC(0, digits);
        return res;
    }
    private void GC(int ind, String digits){
        if(ind == digits.length()){
            res.add(curr.toString());
            return;
        }
        char digit= digits.charAt(ind);
        String letters = map.get(digit);
        for(char ch : letters.toCharArray()){
            curr.append(ch);
            GC(ind+1, digits);
            curr.deleteCharAt(curr.length() -1);
        }
    }
}