//package java.String;
import java.util.*;

public class IsPaladrome {
    public static boolean palidrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(palidrome(word));

    }

}
