
public class Binarysearch {
    public static int binsearch(int num[], int x) {
        int a = num.length;
        int start = 0;
        int end = a - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (num[mid] == x) {
                System.out.println(x + " is at " + mid + " mid position");
            }
            if (num[mid] > x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;// nahi hoga element toh yeh print hojaega
    }

    public static void main(String arg[]) {
        int my_num[] = { 10, 5, 7, 4, 9, 12, 5, 7, 33, 45, 32, 67, 43, 78, 43, 65, 78, 43, 49, 65, 43, 56 };
        System.out.println(binsearch(my_num, 10));

    }
}
