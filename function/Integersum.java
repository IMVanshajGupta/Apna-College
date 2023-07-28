import java.util.Scanner;

public class Integersum {
    public static int Integersum(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n /= 10;
            sum += lastdigit;
        }
        return sum;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Integersum(n));
    }
}
