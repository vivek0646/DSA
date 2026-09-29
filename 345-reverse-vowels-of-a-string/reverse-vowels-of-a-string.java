class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int st = 0;
        int end = s.length() - 1;

        while (st < end) {

            while (st < end && !isVowel(arr[st])) {
                st++;
            }
            while (st < end && !isVowel(arr[end])) {
                end--;
            }

            // Swap vowels
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }

        return new String(arr);
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
}