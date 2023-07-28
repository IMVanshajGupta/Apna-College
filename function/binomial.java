import java.util.*;

public class binomial {

    // factorial func
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f = n * fact(n - 1);

        return f;
    }

    // binomial

    public static int bino(int n, int r) {
        int factr = fact(r);
        int factn = fact(n);
        int factnmr = fact(n - r);

        int ans = (factn) / (factr * factnmr);
        return ans;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write the value of n");
        int n = sc.nextInt();
        System.out.println("write the value of r");

        int r = sc.nextInt();
        if (n < r) {
            System.out.println("pls give n greater thn r");
        } else {
            System.out.println(fact(n));
            System.out.println(fact(r));
            System.out.println(bino(n, r));
        }

    }
}