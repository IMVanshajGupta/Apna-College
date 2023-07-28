import java.util.Stack;

public class Reverse {
    public static void pushatbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);

    }

    public static void reverse(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }
        // kaam
        int top = s.pop();
        reverse(s);// it calls gain and again till all the elements are pop out
        pushatbottom(s, top);// it push each element at the bottom

    }

    // printing function
    public static void PrintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverse(s);
        PrintStack(s);
    }
}
// ana chaiyeh tha 4321 arha hai 1234