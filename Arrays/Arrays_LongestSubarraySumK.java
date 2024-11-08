public class Arrays_LongestSubarraySumK {
    static int getLongestSubarray(int[] a, long k) {  //brute force
        int n = a.length;

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }
                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }


    static int getLongestSubarrayOptimal(int[] arr, long k) {
        int n = arr.length;

        int left = 0;
        int right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }
            return maxLen;
        }

        public static void main (String[]args){
            int[] a = {2, 3, 5, 1, 9};
            long k = 10;
            int len = getLongestSubarrayOptimal(a, k);
            System.out.println("The length of the longest subarray is: " + len);
        }
    }


