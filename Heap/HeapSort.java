public class HeapSort {
    public static void maxify(int arr[], int i, int size) {
        // according to this hum har NODE/PARENT NODE pr jakar check kar rhehinge ki
        // uske child pr us se bada element hai kya agar hai toh un dono ki position hum
        // swap kardengee is se hoga ki woh sb arrange hokar max heap ban jaenge

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIndx = i;
        if (left < size && arr[left] > arr[maxIndx]) {
            maxIndx = left;
        }
        if (right < size && arr[right] > arr[maxIndx]) {
            maxIndx = right;
        }
        if (maxIndx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;
            // har swap ke bad heap bigad jaega usko shi karna padegahume toh wohi kara hai
            // humne
            maxify(arr, maxIndx, size);
        }
    }

    public static void Maxsort(int arr[]) {
        int n = arr.length;
        // build maxheap
        for (int i = n / 2; i >= 0; i--) {// non leaf nodes
            // ko heapify kardenge
            maxify(arr, i, n);
        }
        // push largest at the end
        for (int i = n - 1; i > 0; i--) {
            // swap the largest to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;// sabse bade element ko utha kar use sabse last me kardenge
            // phir uski position wahi fix kardenge {as we are in decreasing loop }
            // woh element phirse aega hi nahi

            maxify(arr, 0, i);
            // swap karne ke bad humara heap bigad jaega usee phirse maxheap banaenge
        }
    }

    public static void minify(int arr[], int i, int size) {

        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIndx = i;
        if (left < size && arr[left] < arr[minIndx]) {// sign change
            minIndx = left;
        }
        if (right < size && arr[right] < arr[minIndx]) {// sign change
            minIndx = right;
        }
        if (minIndx != i) {
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
            minify(arr, minIndx, size);
        }
    }

    public static void Minsort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {// non leaf nodes
            minify(arr, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            minify(arr, 0, i);

        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 4, 5, 3, 2, 6, 7, 2, 5, 3, 4, 7, 4, 4, 54, 2, 5, 664, 2, 8, 9, 5, 4 };
        Maxsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Minsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// TC-->O(nlogn)