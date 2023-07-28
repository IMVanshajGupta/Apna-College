//import java.util.*;

public class RemoveCycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // ---------------------------------------------------------------------------
    public static Node head;
    public static Node tail;
    public static int size;

    // ------------------------------------------------------------------------------
    public static boolean IsCyclic() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                return true;
            }
        }
        return false;// slow is my midnode
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting points
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;//yeh value phele ki hai 
            slow = slow.next;
            fast = fast.next;//fast toh bad me update ho rha hai
        }
        // remove cycle
        prev.next = null;
    }

    public static void main(String arg[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->2
        System.out.println(IsCyclic());
        removeCycle();
        System.out.println(IsCyclic());

    }

}
