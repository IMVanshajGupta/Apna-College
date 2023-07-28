import java.util.*;

public class ConnectNropes {
    public static void connect(int arr[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int ropesum = 0;
        while (pq.size() > 1) {

            int x1 = pq.remove();
            int x2 = pq.remove();
            int sum = x1 + x2;
            pq.add(sum);
            ropesum += sum;
        }
        System.out.print(ropesum);

    }

    public static void main(String arg[]) {
        int arr[] = { 2, 3, 3, 4, 6 };
        connect(arr);
    }

}
