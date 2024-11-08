public class Arrays_LinearSearch {
    static int searchNum(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,7,9,45};
        System.out.println("Element num present at the index: "+searchNum(arr,9));
    }
}
