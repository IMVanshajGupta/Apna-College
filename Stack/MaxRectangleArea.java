import java.util.*;

public class MaxRectangleArea {
    public static void MaxArea(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int MaxArea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        // next smller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next smaller left
        s = new Stack<>();// empty the older stack
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int weidth = nsr[i] - nsl[i] - 1;
            int currArea = height * weidth;
            MaxArea = Math.max(currArea, MaxArea);
        }
        System.out.print("max area in the histogram is " + MaxArea);
    }

    public static void main(String arg[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        MaxArea(arr);
    }
}
// Tc--->O(n)
