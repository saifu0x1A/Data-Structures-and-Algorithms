public class Arrays_MissingNumInArray {
    public static int missingNumber(int[] a, int n){   //brute force
        for (int i=1; i<=n; i++){
            int flag=0;

            for (int j=0; j<n-1; j++){
                if (a[j] == i){
                    flag=1;
                    break;
                }
            }
            if (flag == 0) return i;
        }
        return -1;
    }

    static int missingNumberOptimal1(int[] a, int n){   //Summation Approach
        int sum = (n*(n+1))/2;

        int s2=0;
        for(int i=0; i<n-1; i++){
            s2 += a[i];
        }
        int missingNum = sum - s2;
        return missingNum;
    }

    static int missingNumberOptimal2(int[] a, int n){
        int xor1=0, xor2=0;

        for (int i=0; i<n-1; i++){
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }

    public static void main(String[] args){
        int n=5;
        int[] a = {1,2,4,5};

        int ans = missingNumberOptimal2(a,n);
        System.out.println("The missing number is: "+ans);
    }
}
