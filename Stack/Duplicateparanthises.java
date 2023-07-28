import java.util.Stack;

public class Duplicateparanthises {
    public static boolean isduplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing code
            if (ch == ')') {// closing milte hi elements dekhna shuru kardenge and poping thm out
                int count = 0;
                while (s.peek() != '(') {// jb tak pair nahi milta
                    s.pop();// pop karte jaoo stack se
                    count++;// count ko incre karte jao
                }
                if (count < 1) {// check agr koi element tha hi nahi bich me toh bina bat ke brakets laga rakhe
                                // the
                    return true; // duplicate
                } else {
                    s.pop();// opening pair {'('} agar closing wala mil jata hai count bhi 1se bada hai toh
                            // us opening ko hatao new cloosing ke liyeh search karna shurukaro
                }
            }
            // opening
            else {// sare elements push karte jaenge till we find our closing bracket
                s.push(ch);
            }
        }
        return false;// uper wali condition check ke bad true nahi mila toh matlab no duplicate
                     // return false
    }

    public static void main(String arg[]) {
        String str = "((a+b))";// true
        String str2 = "(a+b)";// false
        System.out.println(isduplicate(str));
        System.out.print(isduplicate(str2));
    }

}
