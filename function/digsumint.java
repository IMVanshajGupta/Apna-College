
// package function;
import java.util.*;

public class digsumint {
    public static int digitsuminteger(int n) {
        System.out.print("sum of digits of " + n);
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n /= 10;
            sum += lastdigit;
        }
        System.out.print(" is "+sum);
        return 0;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write any number");
        int n = sc.nextInt();
        digitsuminteger(n);

    }

}
