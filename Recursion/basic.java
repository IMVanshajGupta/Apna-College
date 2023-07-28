//package java.Recursion;

public class basic {
    public static int sumN(int x) {
        if (x == 1) {
            return 1;
        }
        int s = x + sumN(x - 1);
        return s;
    }

    public static int facto(int x) {
        if (x == 0) {
            return 1;
        }
        int f = x * facto(x - 1);
        return f;
    }

    public static void DecNum(int x) {
        if (x == 1) {
            System.out.print(x);
            return;
        }

        System.out.print(x + " ");
        DecNum(x - 1);

    }

    public static void IncNum(int x) {
        if (x == 1) {
            System.out.print(x + " ");
            return;
        }
        IncNum(x - 1);
        System.out.print(x + " ");

    }

    public static void main(String arg[]) {
        DecNum(10);
        System.out.println();
        IncNum(5);
        System.out.println();
        System.out.println(facto(5));
        System.out.println(sumN(100));

    }
}
