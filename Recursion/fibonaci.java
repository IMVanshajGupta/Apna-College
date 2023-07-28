//package java.Recursion;

public class fibonaci {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fib = fibo(n - 1) + fibo(n - 2);
        return fib;
    }

    public static void main(String arg[]) {
        System.out.print(fibo(5));
    }

}
