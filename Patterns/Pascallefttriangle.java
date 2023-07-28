import java.util.Scanner;

public class Pascallefttriangle {
    public static void pascalleftri(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
//good code mazza ayah
    public static void yo(int rows) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

         rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }

    public static void main(String arg[]) {
        pascalleftri(5);
yo(10);
    }
}
