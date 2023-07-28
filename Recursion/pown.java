public class pown {
    //yeh wala code toh ese hi hawabazi me likh liya tha 
    public static double gpsum(double n, int i) {
        if (i == 0) {
            return 1;
        }
        double x =Math.pow(n, i);
        return x + gpsum(n, i - 1);
    }

    public static int Pown(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int ans = x * Pown(x, n - 1);
        return ans;
    }

    public static int Pown1(int x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return Pown1(x, n / 2) * Pown1(x, n / 2);
        else
            return x * Pown1(x, n / 2) * Pown1(x, n / 2);
    }

    public static int optimisedPown(int x, int n) {
        int temp;
        if (n == 0)
            return 1;
        temp = optimisedPown(x, n / 2);
        if (n % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String arg[]) {
        // System.out.println(Pown(2, 10));
        // System.out.println("space and timecomplexity both are O(n) so we also have
        // optimised approch ");
        // System.out.println(Pown1(2, 10));
        // System.out.println("space and timecomplexity both are O(n) so we also have
        // optimised approch ");
        // System.out.println(optimisedPown(2, 10));
        // System.out.println("space and timecomplexity both are O(logx) so we also have
        // optimised approch ");
        System.out.print(gpsum(0.5, 3));
    }

}
