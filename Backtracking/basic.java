//package java.Backtracking;

// recursion karne ke bad {main fuction}---> {base function} ko hit karne ke bad  wapas
// main function ko wapas ane ke time pr agr hum koi nyaa function pass karwde
// toh use backtracking khete hai

public class basic {
    public static void backtracking(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            Printarr(arr);
            return;
        }
        // recursion {kaam}
        arr[i] = val;
        backtracking(arr, i + 1, val + 1); // function call step {0--->5}
        // jab humara recursive fuction base case tak pahuch jaega i ki valu badate
        // badate toh woh wah print hokar retun hojaega, 1,2,3,4,5
        // -----------------------------------------------------------------
        // jab woh niche aega toh dekhega arr-=2 wala step meaning ki apni array me har
        // value ko 2 se kam kardo humara function wapas arha hoga 4--->0 and har
        // position pr woh apni value ko 2 se kam kar rha hoga,-1,0,1,2,3
        arr[i] -= 2; // backtracking step
    }

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String arg[]) {
        int arr[] = new int[5];
        backtracking(arr, 0, 1);
        Printarr(arr);

    }
}
//time complexity O(n) (:>})
