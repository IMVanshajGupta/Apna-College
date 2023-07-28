//package Patterns;

import java.util.*;
//half pyramid numerical

public class inverthalfnum {
    public static void hpn(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {  //reverse karne ki ninja tech
                System.out.print(n - j + 1); //yeh toh tumhe logic build karna padega khudse i can't help
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            hpn(n);
        }
    }

}
