//package bit manipulation;

public class EvenorOdd {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;

    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;

    }

    public static void main(String arg[]) {
        oddoreven(3);
        oddoreven(6);
        oddoreven(9);
        System.out.println(getithbit(8, 3));
        System.out.println(setithbit(10, 2));
        System.out.print(clearithbit(10, 1));

    }
}
