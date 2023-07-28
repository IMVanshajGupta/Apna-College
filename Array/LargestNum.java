// import java.util.*;

public class LargestNum {
    public static int larnum(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        // System.out.print(largest);
        return largest;
    }

    public static int smanum(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        // System.out.print(largest);
        return smallest;
    }

    public static void main(String arg[]) {
        int my_num[] = { 10, 5, 7, 4, 9, 12, 5, 7, 33, 45, 32, 67, 43, 78, 43, 65, 78, 43, 49, 65, 43, 56 };
        System.out.println(larnum(my_num));
        System.out.println(smanum(my_num));
        

    }
}