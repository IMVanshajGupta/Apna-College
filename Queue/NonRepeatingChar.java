
//package java.Queue;
import java.util.*;;

public class NonRepeatingChar {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];// a----z
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);// given string me se character nikalenge ek ek karke
            q.add(ch);// queue me add karenge
            freq[ch - 'a']++;// yeh humko us character ki index pr lejaenge like a-->0 b-->1 c-->2
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {// jab tak queue empty nah hojae yah peek elements ki freq
                                                              // of coming 1 se zada hai
                q.remove();// we keep removing them
            }
            if (q.isEmpty()) {// agar queue empty hojae to -1 print kardenge
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " "); // warna jo peek pr element hai use print karqadenge
            }
        }
        System.out.println();
    }

    public static void main(String arg[]) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
