
public class WordBreakproblem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int indx = word.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int indx = key.charAt(level) - 'a';
            if (curr.children[indx] == null) {
                return false;
            }
            curr = curr.children[indx];
        }
        return curr.eow == true;
    }

    public static boolean WordBreak(String key) {
        if (key.length() == 0) {
            return true;// jab right wale part me ek bhi letter nahi bachega toh hum true return
                        // kardenge means ki bhai mera toh hogya left wale me jakar dekho agar miljata
                        // hai toh
        }
        for (int i = 1; i <= key.length(); i++) {
            // key ko hum divide kardenge two parts me first part ko search karenge ki woh
            // exist karta hai i nahi and second part pr recursive fuction laga denge so
            // that we can search for remaining parts jab dono true return karenge means
            // word is present in our dictory otherwise nahi hai
            if (search(key.substring(0, i)) &&
                    WordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String arg[]) {
        String words[] = { "i", "like", "sam", "samsung", "ice", "mobile" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String key = "ilikesamsung";
        System.out.print(WordBreak(key));
    }
}
