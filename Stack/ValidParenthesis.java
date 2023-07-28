//Ques Num 20
import java.util.Stack;
public class ValidParenthesis {
    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();// as we store character in stack

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {// opening paranthesis ko store karwa liya
                s.push(ch);
            } else {
                if (s.isEmpty()) {// agar koi opening paranthesis nah mile toh matlabgad bad hai
                    return false;
                }

                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {// pair bante jate hai toh pop karwadenge
                    s.pop();

                } else {
                    return false;// kahi pr nahi bane toh false kardo
                }
            }
        }
        if (s.isEmpty()) { // sb karne ke bad khali hai stack means sbke pair bangye sb pop hogye
            return true;
        } else {
            return false;// agar nahi hue toh return false
        }
    }

    public static void main(String arg[]) {
        String str = "({)}{(}[)]";
        System.out.print(isvalid(str));
    }

}
