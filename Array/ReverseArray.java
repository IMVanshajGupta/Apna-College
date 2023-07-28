public class ReverseArray {
    public static void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;

    }

    public static void revarray(int num[]) {
        int start = 0;
        int end = (num.length - 1);
        while (start < end) {
            int temp;
            temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            // swap(num[start], num[end]); {work nahi kiya swap}
            // bcs return karke koi value nahi arhi thi toh kya printkarwate
            start++;
            end--;
        }
    }

    public static void main(String arg[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        revarray(num);
        for (int i = 0; i < num.length; i++) {// aray print wala code yaad rakkhna bhul nah jana
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
