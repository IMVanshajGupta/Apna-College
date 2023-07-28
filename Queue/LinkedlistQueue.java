
//package java.Queue;

public class LinkedlistQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean IsEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            // agar hum first time add kar rhe hai {first elemnt}
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            // agar single hi block hai { ek hi element hai bas}
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (IsEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String arg[]) {
        Queue q = new Queue();
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
// tc--------->O(1)