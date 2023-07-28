 import java.util.Arrays;

public class ClimbingStairs {

    public static int Countways(int n) {
        // o(2^n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        return Countways(n - 1) + Countways(n - 2);
    }

    public static int memoCountways(int n, int arr[]) {// doing memonization to optimize the code
        // O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        arr[n] = memoCountways(n - 1, arr) + memoCountways(n - 2, arr);
        return arr[n];
    }

    public static int TabCountways(int n) {// doing memonization to optimize the code

        int arr[] = new int[n + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                arr[i] = arr[i - 1] + 0;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[n + 1];
        System.out.println(Countways(n));
        Arrays.fill(arr, -1);// we can fill all the array positon with -1;
        System.out.println(memoCountways(n, arr));
        System.out.println(TabCountways(n));

    }
}
