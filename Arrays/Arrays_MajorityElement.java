import javax.xml.transform.Source;

public class Arrays_MajorityElement {
    static int majorityElement(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }


    static int majorityElementOptimal(int[] arr) {
        int n = arr.length;
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
            int count1 = 0;
            for (i = 0; i < n; i++) {
                if (arr[i] == element) {
                    count1++;
                }
                if (count1 > (n / 2)) {
                    return element;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: "+majorityElementOptimal(arr));
    }
}


