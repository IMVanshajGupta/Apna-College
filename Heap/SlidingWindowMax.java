import java.util.*;

public class SlidingWindowMax {
    static class Pair implements Comparable<Pair> {
        int val;
        int indx;

        public Pair(int val, int indx) {
            this.indx = indx;
            this.val = val;

        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;// descending order
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;// window size
        int res[] = new int[arr.length - k + 1];// new array where result store

        PriorityQueue<Pair> pq = new PriorityQueue<>();// priority queue consisting pairs
        for (int i = 0; i < k; i++) {// window ke size ke element store karwe or unke indx{which our Pair class
                                     // contain}
            pq.add(new Pair(arr[i], i));
        }
        res[0] = pq.peek().val;// queue me se bas hume val chaiye

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().indx <= (i - k)) {// jab tak pq ke andar element hai and currnt element is
                                                                // pre index elemnt
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;//i==>curr element
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
