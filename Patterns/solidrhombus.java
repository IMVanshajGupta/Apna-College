//package Patterns;

import java.util.*;

public class solidrhombus {
    public static void srp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            srp(n);
        }
    }
}
