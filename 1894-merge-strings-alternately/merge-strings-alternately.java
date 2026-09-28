class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int a =0;
        int b=0;
        while(word1.length() > a && word2.length()> b){
            sb.append(word1.charAt(a));
            sb.append(word2.charAt(b));
            a++;
            b++;
        }

        while(word1.length() >a){
            sb.append(word1.charAt(a));
            a++;
        }
        while(word2.length() >b){
        sb.append(word2.charAt(b));
        b++;
        }
        return sb.toString();
    }
}