
//package Patterns;
//kisi bhi pattern ko analyse karlo but dhyan yeh rakhna ki woh mera code 
//HORZONATLY print karwaega nah ki verticaly
//make algo according to outer loop but place things according to HORIZONTAL lane! :]
import java.util.*;

public class butterfly {
    public static void bp(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");// phele wale stars print karwae hai normal format me {lefthand side wale}
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");// spaces need to find there logic in accordance to row,col,n
                // uperwala code left star pattern print karwadega uske bad kespaces dekh
                // i=1 spaces=8 making a pattern of 1----->2(n-i)
                // i=2 spaces=6
                // i=3 spaces=4
                // i=4 spaces=2
                // i=5 spaces=0
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");// again stars are coming(think like konsi row ke kitne stars)
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) { // as we find it the mirror of uper we reverse the inner loop;
            for (int j = 1; j <= i; j++) {// outer loop is same as upper one!
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            bp(n);
        }

    }
}
