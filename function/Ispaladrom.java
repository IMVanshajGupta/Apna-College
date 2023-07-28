//package function;

import java.util.*;

public class Ispaladrom {
    public static int reverse(int n) {
        // int a=n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n /= 10;
            rev = rev * 10 + lastdigit;
        }
        return rev;// agar yeh value kisi or function me dalni hotoh return us value ko hi karwana
                   // function yah kisii or value ko nahi warna woh fuction execute hokar wohi
                   // value derha hoga
    }

    public static boolean ispalidrom(int n) {
        boolean palidrome = true;
        System.out.println(reverse(n));
        if (reverse(n) != n) {
            palidrome = false;
        }
        return palidrome;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(ispalidrom(n));
        

    }

}
