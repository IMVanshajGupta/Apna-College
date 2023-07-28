import java.util.*;

public class PushAtBottom {
    public static void pushatbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {// jese hi hum apni stack ke last me phuch gye sare apne data(element) ko push
                          // kardenge and return kardenge
            s.push(data);
            return;
        }
        int top = s.pop();// store karwate jaenge elements top me nikalte time so that lot te time woh sb
                          // hume miljaee
        pushatbottom(s, data);// yeh fuction ek ek karke humara stack khali karta jaega values top me store
                              // karwata jaega
        s.push(top);// jab hum lot rhe honge toh top ki values add karte jaenge in the same order we
                    // pop thm

    }

    public static void main(String arg[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushatbottom(s, 5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());// i think it is the way to print our stack!!
        }
    }
}
