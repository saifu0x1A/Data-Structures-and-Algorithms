import java.util.Arrays;

public class Arrays_LargestElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 1, 3, 0};
        System.out.println("The Largest element in the array is: " + findLargestElement(arr1));

        int[] arr2 = {8, 10, 5, 7, 9};
        System.out.println("The Largest element in the array is: " + findLargestElement(arr2));
    }

    static int sort(int[] arr) {   //Brute force
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    static int findLargestElement(int[] arr) {   //Optimal
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}