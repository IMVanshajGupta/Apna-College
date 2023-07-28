
//package Patterns;
/* normal pattren hai ishme bas hum ek counter bana lwngw
jiski value increase hogi after completation of every loop*/
import java.util.*;

public class floydtriangle {
    public static void ftp(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ftp(n);

        }
    }
}
