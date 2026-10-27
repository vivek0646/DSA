
class Solution {
    public int findPairs(int[] arr, int k) {
        if (k < 0) return 0;

        Arrays.sort(arr);

        int left = 0;
        int right = 1;
        int count = 0;
        int n = arr.length;

        while (right < n) {
            if (left == right) {
                right++;
                continue;
            }

            int diff = arr[right] - arr[left];

            if (diff == k) {
                count++;

                int a = arr[left];
                int b = arr[right];

                while (left < n && arr[left] == a) {
                    left++;
                }

                while (right < n && arr[right] == b) {
                    right++;
                }
            }
            else if (diff > k) {
                left++;
            }
            else {
                right++;
            }
        }

        return count;
    }
}
