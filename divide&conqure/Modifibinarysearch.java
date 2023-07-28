//package java.divide&conqure;
//si=starting index 
//ei==ending index
public class Modifibinarysearch {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - ei) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        // Line 1
        if (arr[si] <= arr[mid]) {
            // case a{left part}
            if (arr[si] <= tar && arr[mid] >= tar) {
                return search(arr, tar, si, mid - 1);
            }
            // case b{ right part}
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // L2
        else {
            // case c{ right part}
            if (arr[mid] <= tar && arr[ei] >= tar) {
                return search(arr, tar, mid + 1, ei);
            }
            // case d {left part}
            else {
                return search(arr, tar, si, mid - 1);
            }

        }

    }

    public static void main(String arg[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.print(search(arr, 0, 0, arr.length - 1));

    }
}

