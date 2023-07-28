//package java.divide_conquer; 
// Package name should not contain special characters like '&'

public class mergesort {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void conquer(int arr[], int si, int mid, int ei) { // Corrected method name to "conquer"
        int merged[] = new int[ei - si + 1];
        int x = 0;
        int indx1 = si;
        int indx2 = mid + 1; // Corrected the assignment operator here
        while (indx1 <= mid && indx2 <= ei) { // Corrected the condition here
            if (arr[indx1] < arr[indx2]) {
                merged[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }
        }
        while (indx1 <= mid) { // Moved these while loops outside the previous loop
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }
        while (indx2 <= ei) {
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }

        // Copy the merged array back to the original array
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2; // Corrected the formula for calculating mid
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei); // Corrected the method name to "conquer"
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 1, 5, 7, 4, 3, 8, 9, 4, 6, 7 };
        divide(arr, 0, arr.length - 1);
        print(arr); // Print the sorted array after sorting
    }
}
