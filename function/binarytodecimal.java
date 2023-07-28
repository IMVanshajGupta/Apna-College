import java.util.*;

public class binarytodecimal {
    public static int btd(int n) {
        Scanner sc = new Scanner(System.in);
        double decimal = 0;
        int i = 0;
        int a = 2;

        while (n > 0) {
            int lastdigit = n % 10;
            // taking last digit out
            n /= 10;
            decimal = decimal + (lastdigit * Math.pow(a, i));
            System.out.print("");
            i++;

        }
        return (int) decimal;
    }

    // decimal to binary
    public static int dtb(int n) {
        int i = 0;
        int a = 10;
        int binary = 0;

        while (n > 0) {
            int rem = n % 2;

            binary = binary + (rem * (int) Math.pow(a, i));
            i++;
            n /= 2;

        }
        return binary;

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write binary number");

        int n = sc.nextInt();
        System.out.println(btd(n));

        System.out.println("write decimal number");
        int a = sc.nextInt();
        int decimaltobinary = dtb(a);
        System.out.println(decimaltobinary);

    }

}
