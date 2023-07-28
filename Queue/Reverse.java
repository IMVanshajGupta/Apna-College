
//package java.Queue;
import java.util.*;

public class Reverse {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {// queue se nikal kar stack me daloo
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());// stack se nikal kar wapas queue me dalo reverse hojaega
        }
    }

    public static void main(String arg[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }

}
