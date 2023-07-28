
// package Patterns;
/*GOOD PATTREN 
MATRIX APROCH
isme humara logic yeh hai ki
first row ;last row
firsl col;last col 
pr star print karwana hai

baki jagah spaces chaiye
*/
import java.util.*;

public class hollowrectangle {
    public static void hrp(int row, int col) {

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("write the number of rows");
            int num1 = sc.nextInt();
            System.out.println("write the number of columns");
            int num2 = sc.nextInt();
            hrp(num1, num2);
        }

    }

}
