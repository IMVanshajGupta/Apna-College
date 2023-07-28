//package assignment;

public class quest1 {
    public static boolean twice(int num[]) {
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = (i + 1); j < n; j++) {
                if (num[i] == num[j]) {
                    return true;
                }

            }

        }
        return false;
    }

    public static void main(String arg[]) {
        int num1[] = { 2, 4, 1, 5, 3, 5, 6, 3, 5, 6, 36, 7 };
        int num2[] = { 1, 2, 3, 4, };
        int num3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(twice(num3));

        System.out.println(twice(num2));

        System.out.println(twice(num1));

    }
}
