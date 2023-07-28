import java.util.Stack;

public class ReverseString {
    public static String reversestring(String str) {
        Stack<Character> s = new Stack<>();// new stack that can store char
        // for (int i = 0; i < str.length(); i++) {
        // s.push(str.charAt(i)); ^
        // } |
        // |
        int indx = 0;// <|
        while (indx < str.length()) {
            s.push(str.charAt(indx));
            indx++;
        }
        StringBuilder result = new StringBuilder("");// it is better as becasue it have functioanlity to add no need to
                                                     // made a new string everytime
        while (!s.isEmpty()) {
            char curr = s.pop();// nikalte jao
            result.append(curr);// jodte jao
        }
        return result.toString();
    }

    public static void main(String arg[]) {
        String str = "vanshaj";
        String result = reversestring(str);
        System.out.print(result);

    }
}
