
// package Patterns;

/*inverted half pyramid
make logic according to the 
number of rows,col, inserted number
*/

import java.util.*;

public class inverted {
    public static void invpyr(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) { //phele humne spaces print karwai hai unka logic dekh kar
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // thn humare stars arhe hai
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            invpyr(n);
        }

    }

}
