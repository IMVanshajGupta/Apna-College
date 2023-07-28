public class quest2 {

    public static int piviot(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.print(piviot(arr));
    }
}
