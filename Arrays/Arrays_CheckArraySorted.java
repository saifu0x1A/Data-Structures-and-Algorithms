public class Arrays_CheckArraySorted {
    static boolean brute(int arr[], int n) {       //Brute Force Approach
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    static boolean isSorted(int arr[], int n) {    //Optimal Approach
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, n));
    }
}


