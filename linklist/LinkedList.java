
//import java.util.*;

public class LinkedList {
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

    // ----------------------------------------------------------------------------
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // ----------------------------------------------------------------------------

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

        //tail ka next default null hi hoga initialy
    }

    // ----------------------------------------------------------------------------
    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ----------------------------------------------------------------------------
    // to add in the middle
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // whn i=index-1; temp-->previous
        newnNode.next = temp.next; // newnode ke next ki value purane wali node ke next ke barabar kardi or
                                   // puarane wali next ki value to uske agle wale ko point kar hi rhi thi
        temp.next = newnNode; // purane wala node newnode ke head ko point kar rha hai
        // temp.next agli wali node ko target kar rha hai!
    }

    // -----------------------------------------------------------------------------
    // removing first node of the list{head}
    public int removeFirst() {
        // special case when size is 0 or 1
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // -----------------------------------------------------------------------------
    public int itrsearch(int key) {
        Node temp = head;// pheli node head hi hoti hai{starting from zero till last}
        int i = 0;// index
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;// temp ki value updte kardi
            i++;

        }
        return -1;
    }

    // -----------------------------------------------------------------------------
    public int removeLast() {
        // special case when size is 0 or 1
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = tail.data;
        // prev=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {// traversing till we get our previous node of our last node{tail}
            prev = prev.next;
        }
        val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // -----------------------------------------------------------------------------
    // search via recursion method
    public int helper(Node head, int key) {
        if (head == null) {// base case
            return -1;
        }
        if (head.data == key) {// iskey present
            return 0;
        }
        int idx = helper(head.next, key);// recursively calling for nxt head via---> head.next
        if (idx == -1) { // agar recursively call karne ke bad hume humari key nahi milegitoh woh -1
                         // return kardega
            return -1;
        }
        return idx + 1; // warna hum apni nxt index pr achuke hai
    }

    public int recSerch(int key) {
        return helper(head, key);
    }

    // ------------------------------------------------------------------------------

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;// as values assign from left to right
        // at the end humko humari tail ko head banana hai bcs list reverse hogai hai
        // sohumne wohi kiya hai
        Node next;
        while (curr != null) {
            next = curr.next;// curr ke agle wala next
            curr.next = prev;// curr ka next prev wale ko point karega
            // names update kardenge
            prev = curr; // curr banjaega prev
            curr = next;// next banjaega curr
        }
        head = prev;
    }
    // ------------------------------------------------------------------------------

    public void removeNthfroLast(int n) {
        // calculation of size of a linklist
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        // jab size and target node same hojae toh
        // means for 1 in case
        if (n == sz) {
            head = head.next;
            return;
        }
        // yeh loop apne target ke prev wale node tak pahuchne keliyeh
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;// pointing target prev to target next
        return;
    }

    // ----------------------------------------------------------------
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// slow is my midnode
    }

    public static boolean checkPalidrome() {
        // base case
        if (head == null || head.next == null) {// agar khali hia yah ekhi block hia means palidrome hai
            return true;
        }
        // step1:-check mid
        Node midNode = findMid(head);

        // step2:-reverse 2nd half
        Node curr = midNode;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// half right node ka head
        Node left = head;// half left node ka head

        // step3:-check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;// updating right left values
            right = right.next;
        }
        return true;
    }

    // -----------------------------------------------------------------------------------------

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
            perv = curr;
            curr = next;
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
        LinkedList ll = new LinkedList(); // we creat a new object of linkedlist class
        // adding elements
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.removeFirst();
        // ll.removeLast();
        ll.print();
        // System.out.println(checkPalidrome());
        zigzag();
        ll.print();

    }
}
