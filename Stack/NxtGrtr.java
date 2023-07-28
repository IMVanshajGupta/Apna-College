import java.util.Stack;

public class NxtGrtr {
    public static void main(String arg[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtgrtr[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1st work
            // jab tak stack khali nah hojae agar currelement se chote element present hai
            // stack me toh unhe pop kardenge
            // stack khali hojaegi toh kya pop karoge
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2nd
            // agar stack pura khali hai toh nxtgrtr ki value -1 daldo us element ke liyeh
            // warna stack ke top wale ko dal do;
            if (s.isEmpty()) {
                nxtgrtr[i] = -1;
            } else {
                nxtgrtr[i] = arr[s.peek()];
            }
            // 3rd
            // stack me currelement add kardo after all condition check over it
            s.push(i);
        }
        // print nxtgrtr
        for (int i = 0; i < nxtgrtr.length; i++) {
            System.out.println(nxtgrtr[i]);
        }
    }

}
// time complexity--->O(n)
// thing to learn is the working of code it is important

// next greater right(this one <=; n--->0)
// next greater left(change the loop <=; 0--->n)
// next smaller right(change the condition >= ;n--->0)
// next smaller left(change direction with condition >= ;0--->n)
