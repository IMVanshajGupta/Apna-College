
public class Fibonaci {
    public static int fib(int n, int arr[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (arr[n] != 0) {// agar array khali nahi hai toh jo value store hai woh dedo
            return arr[n];
        }
        arr[n] = fib(n - 1, arr) + fib(n - 2, arr);// warna yeh wali value store karwado

        return arr[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = new int[n + 1];
        System.out.print(fib(n, arr));

    }
}