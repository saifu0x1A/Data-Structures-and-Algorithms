public class Arrays_MaximumSubarraySum {
    static int maxSubarraySum(int[] arr, int n){
        int maxi = Integer.MIN_VALUE;

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){

                int sum =0;

                for (int k=i; k<=j; k++){
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }


    static long maxSubarraySumOptimal(int[] arr, int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for (int i=0; i<n; i++){
            sum += arr[i];
            if (sum > maxi){
                maxi = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        System.out.println("The maximum subarray sum is: "+maxSubarraySumOptimal(arr,n));
    }
}

