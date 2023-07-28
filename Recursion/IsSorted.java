public class IsSorted {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstoccur(int arr[], int i, int key) {
        if (i == arr.length - 1) {
            return 0;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, i + 1, key);
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 5, 4, 5,8,19,2,6,8,3 };
        System.out.println(issorted(arr, 0));
        System.out.println(firstoccur(arr, 0, 19));
    }
}
