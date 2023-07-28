import java.util.*;

public class IsPrime {

    public static boolean Prime(int n) {
        boolean Prime = true;

        if (n == 2 && n == 1) {
            return true;
        } else {
            for (int i = 2; i <= (n - 1); i++) {
                if (n % i == 0) {
                    Prime = false;
                    break;
                }

            }
        }
        return Prime;
    }

    // to print prime in range
    public static void rangeprime(int n) {
        System.out.println("prime in range from 2 to "+ n);
        for (int i = 2; i <= n; i++) {
            if (Prime(i) == true) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write any number :-");
        int n = sc.nextInt();
        boolean ans = Prime(n);
        if (ans == true) {
            System.out.println("Yes " + n + " is prime");
        } else {
            System.out.println("It is not a  prime");

        }
        rangeprime(n);
    }
}