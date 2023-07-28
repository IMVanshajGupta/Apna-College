
//package java.Queue;
import java.util.*;;

public class InterQueue {
    public static void interleave(Queue<Integer> q) {
        Queue<Integer> newQueue = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {// agar size ko yah direct likhdenge toh loop me remove hone ke bad diff
                                            // size dega har bar humara queue
            newQueue.add(q.remove());
        }
        while (!newQueue.isEmpty()) {
            q.add(newQueue.remove());
            q.add(q.remove());
        }

    }

    public static void main(String arg[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
