//package java.Queue;

public class ArrQueue {
    // queue ki class banai or usme use hone elemnets ke name diyeh
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // empty fuction O(1)
        public static boolean IsEmpty() {// empty hoga toh -1 return kardega
            return rear == -1;
        }

        // add [enqueue] O(1)
        public static void add(int data) {
            if (rear == size - 1) {// first we check is our queue is full or not
                System.out.print("Queue is full");
                return;
            }
            rear = rear + 1;// if not rare ko shift karte jaenge age one value se
            arr[rear] = data;// orus position pr arr ki element ki value store karwa denge
        }

        // remove[dequeue] tc--------->O(n)
        public static int remove() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");// first we check is it empty or not
                return -1;// khali me se or kya nikaloge
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];// hum front ko shift kardenge ek age so that pichla element or front
            } // khud hi remove hojaega
            rear = rear - 1;
            return front;
        }

        // peek O(1)
        public static int peek() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String arg[]) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.IsEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
