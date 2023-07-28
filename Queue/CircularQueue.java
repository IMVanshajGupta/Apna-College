
//package java.Queue;

public class CircularQueue {
    // queue ki class banai or usme use hone elemnets ke name diyeh
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;// pichli bar toh front const rheta tha hosata hai ish bar change hojae front
                         // circular way me

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // empty fuction
        public static boolean IsEmpty() {// empty hoga toh -1 return kardega
            return rear == -1 && front == -1;
        }

        // isfull
        public static boolean isfull() {
            return (rear + 1) % size == front;// hum rear ko store karwana cha rhe hai nxt block of arry me but wah to
                                              // front hai means sb bhargya {queue is full}
        }

        // add [enqueue] O(1)
        public static void add(int data) {
            if (isfull()) {// first we check is our queue is full or not
                System.out.print("Queue is full");
                return;
            }
            // add frist elemnt
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;// if not rare ko shift karte jaenge age one value se
            arr[rear] = data;// orus position pr arr ki element ki value store karwa denge
        }

        // remove[dequeue]O(1)
        public static int remove() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");// first we check is it empty or not
                return -1;// khali me se or kya nikaloge
            }
            int result = arr[front];

            // last element delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;

            }
            return result;
        }

        // peek O(1)
        public static int peek() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return arr[front];
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
