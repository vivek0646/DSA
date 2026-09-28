class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        String res = str1 + str2;
            int a = str1.length();
            int b = str2.length();

        if((str2 + str1).equals(res)){

          while(b!= 0){   //gcd
                int temp = b;
                b = a%b;
                a = temp;
            }

            for(int i =0; i< a; i++){
                sb.append(str1.charAt(i));
            }
            return sb.toString();
        }
        else{
            return "";
        }
    }
}