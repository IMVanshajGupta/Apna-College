
import java.util.*;

public class Linearsearch {
    public static int linearsearch(int Num[], int a) {
        for (int i = 0; i < Num.length; i++) {
            if (Num[i] == a) {
                System.out.println(a + " yes it is there!");
                System.out.println(i);
                break;
            } else {
                System.out.print("no it is not  at " + i +" position");
            }
            System.out.println();
        }
        
        return 0;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int mark[] = { 1, 2, 3, 4, 5, 6, 7, 12, 34, 56, 75, 23, 56 };
        int x = sc.nextInt();
        linearsearch(mark, x);
    }
}
