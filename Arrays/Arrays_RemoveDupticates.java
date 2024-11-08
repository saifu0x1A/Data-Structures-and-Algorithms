import java.util.*;

    class Arrays_RemoveDuplicates {
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 2, 3, 3};
            int k = removeDuplicatesOptimal(arr);

            System.out.print("The array after removing duplicate elements is: ");
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        static int removeDuplicates(int[] arr) {    //brute force
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
            int k = set.size();
            int j = 0;
            for (int x : set) {
                arr[j++] = x;
            }
            return k;
        }

        static int removeDuplicatesOptimal(int[] arr) {    //optimal
            int i = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
            return i + 1;
        }
    }



