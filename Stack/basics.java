import java.util.*;
public class basics {
    // created a node class so that we can make linklist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // stack using linklist
    static class linkStack {
        static Node head = null;

        public static boolean isEmpty1() {
            return head == null;
        }

        // push
        public static void push1(int data) {
            Node newNode = new Node(data);// we created a new node which is going to be our nextnode
            if (isEmpty1()) {// check if statck is empty thn we directly add/push element to it
                newNode = head;
                return;
            }
            // if not thn we do this
            newNode.next = head;// newnode next pointing to the older node head
            head = newNode; // storing newnode value to head so that nenode become head now
        }

        // pop
        public static int pop1() {
            if (isEmpty1()) {
                return -1;
            }
            int top = head.data;
            head = head.next;// new head is the next head
            return top;
        }

        // peek
        public static int peek1() {
            if (isEmpty1()) {
                return -1;
            }
            return head.data;// return the value of our head
        }

    }

    static class ArrStack {
        static ArrayList<Integer> list = new ArrayList<>();// new arraylist of name lsit!

        // yeh ek function hai to check is our list is empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public static void push(int data) {
            list.add(data);// add the data in the list
        }

        // pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);// top pr jo hai woh dekha humne
            list.remove(list.size() - 1);// us top ko remove karwa diya
            return top;// top jo ab hai use return kardiya
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);// top pr kya element hai woh dekh liya
        }

    }

    public static void main(String arg[]) {
        // ArrStack s = new ArrStack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.push(4);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }
        // linkStack s1 = new linkStack();
        // s1.push1(1);
        // s1.push1(2);
        // s1.push1(3);
        // s1.push1(4);
        // while (!s1.isEmpty1()) {
        // System.out.println(s1.peek1());
        // s1.pop1();
        // }
    }

}
