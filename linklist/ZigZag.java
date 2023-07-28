
public class ZigZag {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void zigzag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // revrse 2nd half
        Node curr = mid.next;
        mid.next = null;// breaked left half
        Node perv = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = perv;
            perv = curr;// perv curr ban gya
            curr = next;// next curr ban gya
        }
        Node LH = head;
        Node Rh = perv;
        Node nextL, nextR;
        while (Rh != null && LH != null) {
            // zigzag
            nextL = LH.next;
            LH.next = Rh;
            nextR = Rh.next;
            Rh.next = nextL;
            // update
            Rh = nextR;
            LH = nextL;
        }

    }

    public static void main(String arg[]) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println(ll);
        zigzag();// static non static ka kuch chakar hojata hia dekhna padega
        System.out.println(ll);
    }
}// showing error will check later